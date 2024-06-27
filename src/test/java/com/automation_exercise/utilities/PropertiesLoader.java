package com.automation_exercise.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    public static String loadProperty(String propertyName) {
        try (InputStream inputStream = new FileInputStream("src/test/resources/config.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.getProperty(propertyName);
        } catch (IOException e) {
            System.err.println("Failed to load property: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
