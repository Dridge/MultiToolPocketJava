package serialization;

import java.io.*;

public class Serializer {
    //TODO replace this with NIO reader
    public String serializeToFile(Serializable objectToSerialize) throws IOException {
        String fileName = System.getProperty("user.dir") + objectToSerialize.getClass().getName() + ".txt";
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(objectToSerialize);
        return fileName;
    }
}
