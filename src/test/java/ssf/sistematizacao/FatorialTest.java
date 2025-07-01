package ssf.sistematizacao;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class FatorialTest {

    @Test
    public void testFatorial_Caso1() {

        CalcDifSabs calculadora = new CalcDifSabs();
        // Fatorial de 5 = 120

        int resultado = calculadora.fatorial(5);
        assertEquals(120, resultado);
    }

    @Test
    public void testFatorial_Caso2() {

        CalcDifSabs calculadora = new CalcDifSabs();
        // Fatorial de 3 = 6

        int resultado = calculadora.fatorial(3);
        assertEquals(6, resultado);
    }
    
    @Test
    public void testFatorial_Caso3() {

        CalcDifSabs calculadora = new CalcDifSabs();
        // Fatorial de 4 = 24
        
        int resultado = calculadora.fatorial(4);
        assertEquals(24, resultado);
    }
}


