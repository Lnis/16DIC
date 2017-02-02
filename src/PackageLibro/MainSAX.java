package PackageLibro;

import java.io.FileInputStream;

import org.xml.sax.InputSource;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;



public class MainSAX {

	public static void main(String[] args) throws Throwable{
		XMLReader reader = XMLReaderFactory.createXMLReader();
		
		ParserLibroXML parserLibro = null;
		parserLibro = new ParserLibroXML();
		
		reader.setContentHandler(parserLibro);	//Cuando va leyendo las etiquetas <libro>, <titulo>, <autor>, va llamando a la clase ParserLibreXML
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
	}
}
