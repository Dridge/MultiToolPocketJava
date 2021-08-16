package Properties;

import java.io.FileReader;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;


public class PropertiesManager {
    //TODO replace this with NIO reader
    public Map<String, String> loadProperties(String propertiesFile) throws IOException {
        FileReader reader = new FileReader(propertiesFile);
        Properties properties = new Properties();
        properties.load(reader);
        return properties.entrySet().stream().collect(
                Collectors.toMap(
                    e -> String.valueOf(e.getKey()),
                    e -> String.valueOf(e.getValue())
            ));
    }




}
