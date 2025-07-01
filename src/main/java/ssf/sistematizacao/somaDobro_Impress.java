package ssf.sistematizacao;

public class somaDobro_Impress {

    public int somaDobro(int a, int b) {
        return a + b * 2;
    }

    public static void main(String[] args) {
        
        CalcDifSabs calculadora = new CalcDifSabs();

        int[][] pares = {{2, 3}, {-1, 5}};

        for (int[] par : pares) {

            int a = par[0];
            int b = par[1];

            int resultado = calculadora.somaDobro(a, b);

            System.out.println("somaDobro(" + a + ", " + b + ") = " + resultado);

        }
    }
}
