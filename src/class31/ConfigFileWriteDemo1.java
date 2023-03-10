package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        // Path where we want to create the new file and the name of the file with its exstension
        String path="Files/test.properties";

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        // we use FileOutputStream when we have to write the data to a file
        Properties properties=new Properties();

        // we use the setProperty method to store data inside a properties files
        properties.setProperty("Name","Anees");

        // A method to write the data to the disk
        properties.store(fileOutputStream,"A new name has been added");







    }
}
