package availableFunction;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample1 {
    public static void main(String[] args) throws Exception {
        // create properties object
        Properties properties = new Properties();
        // add property into properties object
        properties.setProperty("user", "admin");
        properties.setProperty("password", "admin123");
        // write properties to a file
        properties.store(new FileWriter("info.properties"), "Comment here");
    }
}