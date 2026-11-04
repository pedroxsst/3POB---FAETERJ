"""Verifica o programa pelo terminal, sem alterar o CSV do repositorio."""
from pathlib import Path
import os
import subprocess
import sys
import tempfile

classes = str(Path(sys.argv[1]).resolve())
total = 0

with tempfile.TemporaryDirectory() as pasta:
    raiz = Path(pasta)
    dados = raiz / "CadastroPessoas"
    dados.mkdir()
    csv = dados / "pessoas.csv"
    cabecalho = "id;nome;idade;altura\n"

    def executar(entrada):
        resultado = subprocess.run(
            ["java", "-Dfile.encoding=UTF-8", "-Dstdout.encoding=UTF-8",
             "-Dstderr.encoding=UTF-8", "-cp", classes, "CadastroPessoas.App"],
            input=entrada, text=True, encoding="utf-8", capture_output=True,
            cwd=raiz, timeout=10,
        )
        assert resultado.returncode == 0, resultado.stderr
        assert not resultado.stderr, resultado.stderr
        return resultado.stdout

    def conferir(condicao, mensagem):
        global total
        assert condicao, mensagem
        total += 1

    saida = executar("4\n0\n")
    conferir("Nenhuma pessoa cadastrada." in saida, "Listagem vazia")
    conferir(not csv.exists(), "Arquivo ausente deve ser aceito")

    saida = executar("1\n1\nAna, Maria Ávila\n22\n1,68\n1\n2\nBruno\n35\n1.82\n4\n0\n")
    conferir(saida.count("Pessoa incluida com sucesso.") == 2, "Inclusoes")
    conferir("Ana, Maria Ávila" in saida and "Bruno" in saida, "Listagem")
    conferir(csv.read_text(encoding="utf-8") ==
             cabecalho + "1;Ana, Maria Ávila;22;1.68\n2;Bruno;35;1.82\n",
             "CSV e altura com virgula")

    antes = csv.read_bytes()
    saida = executar("1\n1\n2\n999\n3\n999\nabc\n9\n0\n")
    conferir("Ja existe uma pessoa com esse ID." in saida, "ID repetido")
    conferir(saida.count("Pessoa nao encontrada.") == 2, "ID inexistente")
    conferir("Numero invalido." in saida and "Opcao invalida." in saida, "Menu invalido")
    conferir(csv.read_bytes() == antes, "Operacoes rejeitadas preservam o CSV")

    saida = executar("2\n1\nAna Souza\n23\n1.70\n3\n2\n4\n0\n")
    conferir("Pessoa alterada com sucesso." in saida, "Alteracao")
    conferir("Pessoa excluida com sucesso." in saida, "Exclusao")
    conferir(csv.read_text(encoding="utf-8") == cabecalho + "1;Ana Souza;23;1.7\n",
             "Persistencia da alteracao e exclusao")
    saida = executar("4\n0\n")
    conferir("Ana Souza" in saida and "Bruno" not in saida, "Reabertura do cadastro")
    saida = executar("3\n1\n4\n0\n")
    conferir("Nenhuma pessoa cadastrada." in saida, "Exclusao da ultima pessoa")
    conferir(csv.read_text(encoding="utf-8") == cabecalho, "CSV vazio com cabecalho")

    for id_, nome, idade, altura in [
        ("0", "Ana", "20", "1.7"),
        ("-1", "Ana", "20", "1.7"),
        ("1", "  ", "20", "1.7"),
        ("1", "Ana;Silva", "20", "1.7"),
        ("1", "Ana", "-1", "1.7"),
        ("1", "Ana", "20", "0"),
        ("1", "Ana", "20", "-1"),
        ("1", "Ana", "20", "NaN"),
        ("1", "Ana", "20", "Infinity"),
    ]:
        saida = executar(f"1\n{id_}\n{nome}\n{idade}\n{altura}\n0\n")
        conferir("Pessoa incluida com sucesso." not in saida, "Rejeitar dados invalidos")
        conferir(csv.read_text(encoding="utf-8") == cabecalho, "Preservar CSV")

    conferir("Numero invalido." in executar("1\n2147483648\n0\n"), "ID acima do limite")
    conferir("Numero invalido." in executar("1\n1\nAna\nabc\n0\n"), "Idade nao numerica")
    conferir("Numero invalido." in executar("1\n1\nAna\n20\nabc\n0\n"), "Altura nao numerica")
    conferir("Programa encerrado." in executar("1\n1\n"), "Fim da entrada")

    for conteudo in [
        "",
        "cabecalho errado\n",
        cabecalho + "1;Ana;20\n",
        cabecalho + "1;Ana;idade;1.7\n",
        cabecalho + "1;Ana;-1;1.7\n",
        cabecalho + "1;Ana;20;NaN\n",
        cabecalho + "1;Ana;20;1.7\n1;Bruno;30;1.8\n",
    ]:
        csv.write_text(conteudo, encoding="utf-8")
        antes = csv.read_bytes()
        conferir("Nao foi possivel carregar" in executar("1\n"), "CSV invalido")
        conferir(csv.read_bytes() == antes, "CSV invalido preservado")

    # O runner Linux permite simular uma pasta sem permissao de escrita.
    if os.name != "nt":
        csv.unlink()
        dados.chmod(0o555)
        try:
            saida = executar("1\n1\nAna\n20\n1.7\n4\n0\n")
            conferir("Nao foi possivel salvar." in saida, "Falha de gravacao")
            conferir("Nenhuma pessoa cadastrada." in saida, "Memoria preservada na falha")
            conferir(not csv.exists(), "Falha nao cria CSV parcial")
        finally:
            dados.chmod(0o755)

print(f"{total} verificacoes passaram.")
