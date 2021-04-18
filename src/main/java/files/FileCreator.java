package files;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public boolean createFile(String fileName) {
        File newFile = new File(fileName);
        boolean success = false;
        try {
            success = newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return success;
    }
}
