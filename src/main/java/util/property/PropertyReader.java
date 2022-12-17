package util.property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private static PropertyReader instance = null;
    private Properties properties = null;

    private PropertyReader() {
        properties = new Properties();
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("Config.properties");
        properties.load(inputStream);
        } catch (IOException e){
            e.getMessage();
        }
    }
    public static PropertyReader getInstance() {
        if (instance == null) {
            instance = new PropertyReader();
        }
        return instance;
    }
    public String getValue(String key) {
        return this.properties.getProperty(key, String.format("The key %s doesn't exist", key));
    }
}
