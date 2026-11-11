# Lista 14 - Testes unitários

Cinco exercícios resolvidos em Java com JUnit 5 e Mockito.

| Exercício | Conteúdo |
| --- | --- |
| 01 | Validador de senha com testes parametrizados e fontes de valores nulos e vazios |
| 02 | Conta bancária: BeforeEach, exceções personalizadas e assertThrows |
| 03 | UsuarioService: Mock, InjectMocks, when, verify e times |
| 04 | NotificacaoService: ArgumentCaptor e verificação de e-mail personalizado |
| 05 | ProcessadorPagamentoService: doThrow, never e consistência em caso de falha |

## Estrutura

- src/main/java/Lista14/Exercicio01 a Exercicio05: classes de implementação.
- src/test/java/Lista14/Exercicio01 a Exercicio05: testes unitários.
- pom.xml: dependências e configuração do Maven.
- O Exercício 04 reutiliza a classe Usuario do Exercício 03.

## Execução

É necessário ter JDK 17 ou superior e Apache Maven. A partir da raiz do repositório:

    cd Lista14
    mvn test

O Maven baixa as dependências do JUnit 5 e Mockito quando necessário, compila as classes e executa os testes. Os repositórios, gateway de pagamentos e serviço de e-mail são simulados: nenhum serviço real é acionado.

Os testes também são executados por um workflow do GitHub Actions ao alterar arquivos desta lista.

[Voltar ao início](../README.md)
