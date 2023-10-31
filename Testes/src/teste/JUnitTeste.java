package teste;

import junit.framework.TestCase;

public class JUnitTeste extends TestCase {
    Operacao op = new Operacao();
    public void testeAdicao(){
        assertEquals(4.0, op.adicao(2, 2));
        assertEquals(2.0, op.adicao(1, 1));
        assertEquals(6.0, op.adicao(2, 4));
    }
    public void testeSubtracao(){
        assertEquals(1.0, op.subtracao(2, 1));
        assertEquals(1.0, op.subtracao(3, 2));
        assertEquals(-2.0, op.subtracao(2, 4));
    }
    public void testeMultiplicacao(){
        assertEquals(2.0, op.multiplicacao(2, 1));
        assertEquals(6.0, op.multiplicacao(3, 2));
        assertEquals(8.0, op.multiplicacao(2, 4));
    }
    public void testeDivisao(){
        assertEquals(2, op.divisao(4, 2));
        assertEquals(3.0, op.divisao(6, 2));
        assertEquals(5, op.divisao(12, 6));
    }
}
