package serialization;

import java.io.*;

public class Deserializer {
    //TODO replace this with NIO reader
    public Object deserializeFromFile(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        return input.readObject();
    }
}
