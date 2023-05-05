package exercicios;

public class TesteLimpar {

	public static void main(String[] args) {
		System.out.println("te");
		limpa();
		System.out.println("tttt");
	}
	
    public final static void limpa()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }


}
