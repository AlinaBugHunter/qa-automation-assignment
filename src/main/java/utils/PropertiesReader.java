package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    // Reads a property value from a specified properties file
    public static String getProperty(String fileName, String key) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/properties/" + fileName)) {
            properties.load(fileInputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}