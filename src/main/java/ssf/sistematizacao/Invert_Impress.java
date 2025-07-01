package ssf.sistematizacao;


public class Invert_Impress 
{
    public static void main( String[] args )
    {
        CalcDifSabs calculadora = new CalcDifSabs();

         int[] numeros = {5678, 400, 1005, 24};

        for (int numero : numeros) {
            int resultado = calculadora.inverteNumero(numero);
            System.out.println("Número original: " + numero + " | Número invertido: " + resultado);
        }
    }
}

