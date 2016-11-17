package org.krisbox.ihub.examples.utils.utils.impl;

import org.krisbox.ihub.examples.utils.ClassProperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ClassPropertiesImpl extends FTPBirtLoggerImpl implements ClassProperties {
    private final String PROPERTY_FILE = "BirtFtpUploader.properties";

    public ClassPropertiesImpl(){
        super();
    }

    public Object getProperty(String name) {
        Properties  props       = null;
        InputStream inputStream = null;

        try {
            props = new Properties();
            inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTY_FILE);
            props.load(inputStream);
        }catch(Exception ex){
            fatal(ex);
        }finally{
            try {
                inputStream.close();
            }catch(IOException ex){
                error(ex);
            }
        }

        return props.get(name);
    }
}
