package CadastroPessoas;

import CadastroPessoas.controller.PessoaController;

/*
Cadastro de pessoas com MVC, ArrayList, excecoes e arquivo pessoas.csv.
Permite incluir, alterar, excluir e listar pessoas pelo terminal.
*/
public class App
{
    public static void main(String[] args)
    {
        new PessoaController().iniciar();
    }
}
