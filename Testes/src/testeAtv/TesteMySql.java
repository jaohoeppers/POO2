package testeAtv;

import junit.framework.TestCase;

public class TesteMySql extends TestCase {

    MySql my = new MySql();
    public void testeScript1(){
        assertEquals("joao INT NOT NULL AUTO_INCREMENT, joao INT AUTO_INCREMENT, joao INT NOT NULL, joao INT", my.createScript("joao"));
    }

    public void testeScript2(){
        assertEquals("numero INT NOT NULL AUTO_INCREMENT, numero INT AUTO_INCREMENT, numero INT NOT NULL, numero INT", my.createScript("numero"));
    }
}
