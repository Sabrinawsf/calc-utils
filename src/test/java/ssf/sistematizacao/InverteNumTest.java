package ssf.sistematizacao;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class InverteNumTest 
{

    @Test
    public void testInverteNumero_Caso1() {

        CalcDifSabs calculadora = new CalcDifSabs();

        int resultado = calculadora.inverteNumero(5678);
        assertEquals(8765, resultado);
    }
    @Test
    public void testInverteNumero_Caso2() {
        CalcDifSabs calculadora = new CalcDifSabs();
        int resultado = calculadora.inverteNumero(400);
        assertEquals(4, resultado); // o 004 não é representado como número
    }

    @Test
    public void testInverteNumero_Caso3() {
        CalcDifSabs calculadora = new CalcDifSabs();
        int resultado = calculadora.inverteNumero(1005);
        assertEquals(5001, resultado);
    }

    @Test
    public void testInverteNumero_Caso4() {
        CalcDifSabs calculadora = new CalcDifSabs();
        int resultado = calculadora.inverteNumero(24);
        assertEquals(42, resultado);
    }
}

