/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ligadeesportearmador.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XmlUtil {
    
    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";

    public static <T> void marshal(T obj, OutputStream out, boolean indentingXml, String charsetName) throws FileNotFoundException, JAXBException, UnsupportedEncodingException {
        JAXBContext context = JAXBContext.newInstance(obj.getClass()); // xml files
        Marshaller marshaller = context.createMarshaller();
        if (indentingXml) {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Define a saida do xml formatado e identado. Por padrao fica o arquivo todo em uma linha unica. 
        }
        if(charsetName != null && !charsetName.equals(""))
            marshaller.marshal(obj, new OutputStreamWriter(out, charsetName)); // ISO-8859-1 para caracteres especiais
        else
            marshaller.marshal(obj, out);
    }

    public static <T> T unmarshal(Class<T> objClass, InputStream in, String charsetName) throws FileNotFoundException, JAXBException, UnsupportedEncodingException {
        JAXBContext context = JAXBContext.newInstance(objClass); // xml files
        Unmarshaller unmarshaller = context.createUnmarshaller();
        T obj = null;
        if(charsetName != null && !charsetName.equals(""))
            obj = (T) unmarshaller.unmarshal(new InputStreamReader(in, charsetName));
        else
            obj = (T) unmarshaller.unmarshal(in);
        return obj;
    }
    
    public static <T> void marshalValidate(T obj, OutputStream out, boolean indentingXml, String charsetName, File schemaFile) throws JAXBException, UnsupportedEncodingException, SAXException {    
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(schemaFile);
        marshaller.setSchema(schema);
        marshaller.setEventHandler(new ValidationEventHandler() {
            public boolean handleEvent(ValidationEvent event) {
                System.out.println(event);
                return false;
            }
        });
        if (indentingXml) {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Define a saida do xml formatado e identado. Por padrao fica o arquivo todo em uma linha unica. 
        }
        if(charsetName != null && !charsetName.equals(""))
            marshaller.marshal(obj, new OutputStreamWriter(out, charsetName)); // ISO-8859-1 para caracteres especiais
        else
            marshaller.marshal(obj, out);
    }
    
    public static <T> void schemaGenerator(Class<T> objClass, final OutputStream out) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(objClass); // xsd files
        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                StreamResult result = new StreamResult(out);
                return result;
            }
        });
    }
    
    /*
    public static void classGeneratorFromSchema(String schemaPathfile, String folderOutputPath,String packageStructure) throws IOException{
        //xjc teste.xsd -d src -p br.com.caelum.fj31.generated
        Runtime.getRuntime().exec("xjc "+schemaPathfile+" -d "+folderOutputPath+" -p "+packageStructure);
    }
    */
}
