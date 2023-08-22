package agenda_de_contatos;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class XML extends contato{

    public XML(String nome, String datanasc, String telefone, String email) throws ParserConfigurationException {
        super(nome, datanasc, telefone, email);
    }

    public boolean inserir() throws ParserConfigurationException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory documento = DocumentBuilderFactory.newInstance();
        DocumentBuilder credocumento = documento.newDocumentBuilder();

        Document doc = credocumento.parse("file:C:\\Users\\jaoho\\OneDrive\\Trabalhos BCC\\BCC 2° Ano\\POO2\\poo.Xml");
        Element elemento = doc.getDocumentElement();

        Element novoContato = doc.createElement("Contato");

        Element nomeElemento = doc.createElement("Nome");
        nomeElemento.appendChild(doc.createTextNode(this.getNome()));
        novoContato.appendChild(nomeElemento);

        Element datanascElemento = doc.createElement("DataNasc");
        datanascElemento.appendChild(doc.createTextNode(this.getDatanasc()));
        novoContato.appendChild(datanascElemento);

        Element telefoneElemento = doc.createElement("Telefone");
        telefoneElemento.appendChild(doc.createTextNode(this.getTelefone()));
        novoContato.appendChild(telefoneElemento);

        Element emailElemento = doc.createElement("Email");
        emailElemento.appendChild(doc.createTextNode(this.getEmail()));
        novoContato.appendChild(emailElemento);

        elemento.appendChild(novoContato);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("C:\\Users\\jaoho\\OneDrive\\Trabalhos BCC\\BCC 2° Ano\\POO2\\poo.Xml"));
        transformer.transform(source, result);

        return true;
    }
}
