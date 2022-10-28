package properties;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle config = ResourceBundle.getBundle("propriete");
		
		//String firstName = config.getString("database.driver");
		
		Enumeration <String> EnumConfig = config.getKeys();
		
		while (EnumConfig.hasMoreElements())
		{
			System.out.println(EnumConfig.nextElement());
		}
		
	
		
		
		
	}

}
