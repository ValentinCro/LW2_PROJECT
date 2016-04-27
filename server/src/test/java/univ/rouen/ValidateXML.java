package univ.rouen;


import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import univ.rouen.model.SimpleErrorHandler;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;


public class ValidateXML {
	
	@Test
	public boolean should_validate(String fluxXml) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);

		SchemaFactory schemaFactory =
		    SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

		try {
			factory.setSchema(schemaFactory.newSchema(
			    new Source[] {new StreamSource("src/main/resources/stb2.xsd")}));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleErrorHandler handler = new SimpleErrorHandler();
		builder.setErrorHandler(handler);

		try {
			Document document = builder.parse(fluxXml);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return handler.hasError();
	}
}
