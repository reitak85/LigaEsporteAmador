package br.com.ligadeesportearmador.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {  
      
    private Properties props;  
    private String fileName = "/META-INF/";  
  
    
    public PropertiesLoader(String name) {
        InputStream in = getClass().getResourceAsStream(fileName+name);  
        try {  
            loadProperties(in);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }    
      
    private void loadProperties(InputStream in) throws IOException {  
        props = new Properties();  
        props.load(in);  
        in.close();  
    }  
  
   
    public String getContent(String chave) {  
        return props.getProperty(chave).trim();  
    }  
}  