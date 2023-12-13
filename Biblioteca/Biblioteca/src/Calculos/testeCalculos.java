package src.Calculos;

import junit.framework.TestCase;

import java.util.*;

public class testeCalculos extends TestCase {

    Integer[][] arr = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},};

    public void testeDesvioPadrao(){
        assertEquals(2.8722813232690143, new factoryCalculaPadrao().criar("desvio padrao",arr).calcula());
    }
    public void testeMediana(){
        assertEquals(5.5, new factoryCalculaPadrao().criar("mediana",arr).calcula());
    }
    public void testeModa(){
        assertEquals(1.0, new factoryCalculaPadrao().criar("moda",arr).calcula());
    }
    public void testeVariancia(){
        assertEquals(8.25, new factoryCalculaPadrao().criar("variancia",arr).calcula());
    }
    public void testeMedia(){
        assertEquals(5.5, new factoryCalculaPadrao().criar("media",arr).calcula());
    }
    public void testeFrequencia() { assertEquals("{1=10, 2=10, 3=10, 4=10, 5=10, 6=10, 7=10, 8=10, 9=10, 10=10}", new factoryCalculaPadrao().criar("frequencia",arr).calcula(" ").toString()); }
    public void testeAmplitude(){
        assertEquals(9.0, new factoryCalculaPadrao().criar("amplitude",arr).calcula());
    }
}