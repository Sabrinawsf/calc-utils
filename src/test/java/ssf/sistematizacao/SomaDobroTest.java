package ssf.sistematizacao;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaDobroTest {

    @Test
    public void testSomaDobro_Caso1() {

        CalcDifSabs calculadora = new CalcDifSabs();
        // 2 + 3*2 = 2 + 6 = 8

        int resultado = calculadora.somaDobro(2, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testSomaDobro_Caso2() {

        CalcDifSabs calculadora = new CalcDifSabs();
        // -1 + 5*2 = -1 + 10 = 9

        int resultado = calculadora.somaDobro(-1, 5);
        assertEquals(9, resultado);
    }

}

