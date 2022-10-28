package xml;

import java.util.Enumeration;
import java.util.Iterator;

import javax.naming.ConfigurationException;


import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

public class testConfigurationXML {

	public static void main(String[] args) throws org.apache.commons.configuration2.ex.ConfigurationException {
		// TODO Auto-generated method stub
		
		Configurations configs = new Configurations();
		XMLConfiguration config = configs.xml("doc.xml");
		String nomBase = config.getString("database[@nom]");
		System.out.println(nomBase);
	
		
		Iterator<String> itC = config.getKeys();
		while (itC.hasNext())
		{
			String key = itC.next();
			String val = config.getString(key);
			System.out.println(val+" = "+key);
		}
		
		
		
		

	}
}
