package Lista10.Exercicio05;

public class ProcessamentoDadosException extends Exception
{
    private static final long serialVersionUID = 1L;

    public ProcessamentoDadosException(String mensagem, Throwable causa)
    {
        super(mensagem, causa);
    }
}
