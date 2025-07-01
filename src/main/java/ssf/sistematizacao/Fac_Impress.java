package ssf.sistematizacao;

public class Fac_Impress {

    public static void main(String[] args) {
        CalcDifSabs calculadora = new CalcDifSabs();

        int[] numeros = {5, 3, 4};

        for (int numero : numeros) {
            int resultado = calculadora.fatorial(numero);
            System.out.println("Fatorial de " + numero + " = " + resultado);
        }
    }
}


