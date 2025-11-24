import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XMLTransformer {
    public static void main(String[] args) {
        transformarXML("library.xml", "transform_html.xsl", "output.html");
        transformarXML("library.xml", "transform_json.xsl", "output.json");
        transformarXML("library.xml", "transform_xml.xsl", "output_transformed.xml");
    }

    public static void transformarXML(String xmlFile, String xsltFile, String outputFile) {
        try {
            Source xmlInput = new StreamSource(new File(xmlFile));
            Source xslt = new StreamSource(new File(xsltFile));
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xslt);
            Result output = new StreamResult(new File(outputFile));
            
            transformer.transform(xmlInput, output);
            System.out.println("Transformación completada: " + outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
