package testeAtv;

import junit.framework.TestCase;

import java.util.Optional;

public class TesteCalculos extends TestCase {

    int[] valores = {12, 32, 11, 12, 55, 10, 23, 14, 30};
    Calculos calc = new Calculos();

    public void testeMedia(){
        assertEquals(22.11111111111111, calc.media(valores));
    }
    public void testeModa(){
        assertEquals(Optional.of(12), calc.moda(valores));
    }
    public void testeMediana(){
        assertEquals(14.0, calc.mediana(valores));
    }
    public void testeVariancia(){
        assertEquals(198.09876543209873, calc.variancia(valores));
    }
    public void testeDesvioPadrao(){
        assertEquals(14.07475631874665, calc.desvioPadrao(valores));
    }

}
