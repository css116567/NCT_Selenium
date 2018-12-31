package Core;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

	protected Properties prop=null;

	protected InputStream input=ReadPropertyFile.class.getClassLoader().getResourceAsStream("\\Resources\\config.properties");
	
	public ReadPropertyFile() throws Exception{
		prop = new Properties();
		prop.load(input);
	}
	
	public String geturlsf(){
		return prop.getProperty("URL");
	}
	public String getUserNamesf(){
		return prop.getProperty("UserName");
	}			
	public String getPasswordsf(){
		return prop.getProperty("paaword");
	}
	public String getAccountName(){
		return prop.getProperty("AccountName");
	}
	public String geturlEpic1(){
		return prop.getProperty("URLEpic1");
		
	}
    public String getUserNameEpic1BranchVolunteer(){
	return prop.getProperty("UserNameEpic1BranchVolunteer");
	
    }
    public String getpaawordEpic1BranchVolunteer(){
    	return prop.getProperty("paawordEpic1BranchVolunteer");
    	
    }
    
}

		
	
	
	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


