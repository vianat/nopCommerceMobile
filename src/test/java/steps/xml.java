package steps;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class xml {

    private static final String XML_FILENAME = "src/test/java/steps/cab.xml";
    private static final String XSLT_FILENAME = "src/test/java/steps/scheema.xsl";

    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try (InputStream is = new FileInputStream(XML_FILENAME)) {

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(is);

            // transform xml to txt via a xslt file
            try (FileOutputStream output =
                         new FileOutputStream("src/test/java/steps/fufel.txt")) {
                transform(doc, output);
            }

        } catch (IOException | ParserConfigurationException |
                 SAXException | TransformerException e) {
            e.printStackTrace();
        }

    }

    private static void transform(Document doc, OutputStream output)
            throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        // add XSLT in Transformer
        Transformer transformer = transformerFactory.newTransformer(
                new StreamSource(new File(XSLT_FILENAME)));

        transformer.transform(new DOMSource(doc), new StreamResult(output));

    }
}