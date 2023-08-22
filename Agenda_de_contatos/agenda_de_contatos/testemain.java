package agenda_de_contatos;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class testemain {


    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException, SAXException {

//        MySQL cont1 = new MySQL("giagay", "2003-10-06", "47997092526", "giagay@gai.com");
//        MySQL cont2 = new MySQL("jao", "2003-10-06", "47997092526", "jaohoeppers@gmail.com");

//        System.out.println(cont1.inserir());
//        System.out.println(cont2.inserir());

//        XML cont1 = new XML("gian", "2003-10-16", "8888888", "giazin@hotmart.com");
        XML cont2 = new XML("jao", "2003-10-06", "47997092526", "jaohoeppers@gmail.com");

//        System.out.println(cont1.inserir());
        System.out.println(cont2.inserir());

    }
}
