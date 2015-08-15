package autumn.autumn_core.xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		try {
			Document   document = reader.read(new File("src/main/resources/test.xml"));
			Element root = document.getRootElement(); 
			
			for(Iterator it=root.elementIterator();it.hasNext();){    
		        Element element = (Element) it.next();
		        String id = element.attributeValue("id");
		        String className = element.attributeValue("class");
		        
		        System.out.println(className);
		        System.out.println(id);
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}  
		

	}

}
