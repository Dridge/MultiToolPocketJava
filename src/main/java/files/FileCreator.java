package files;

import java.io.IOException;
import java.nio.file. * ;

public class FileCreator {
     // Current directory system property: https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/io/File.html
    private final String currentDirectory = "user.dir";
    public boolean createFile(String fileName) {
        return createFile(System.getProperty(currentDirectory), fileName);
    }

    public boolean createFile(String fullDirectory, String fileName) {
        boolean success;
        Path fileNameAsPath = Paths.get(fullDirectory, fileName);
        try {
            Files.createFile(fileNameAsPath);
            success = true;
        } catch (IOException e) {
            success = false;
            e.printStackTrace();
        }
        return success;
    }
}
