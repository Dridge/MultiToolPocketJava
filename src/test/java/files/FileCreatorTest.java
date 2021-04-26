package files;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class FileCreatorTest {
    String testFileName = "testFile";
    @AfterEach
    public void tearDown() {
        try {
            Files.delete(Paths.get(System.getProperty("user.dir"), testFileName));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Clean up post test failed!");
        }
    }

    @Test
    public void testFileIsCreated() {

        FileCreator fileCreator = new FileCreator();
        assertTrue(fileCreator.createFile(testFileName));
        checkFileExists(testFileName);
    }

    private void checkFileExists(String fileName) {
        try {
            new FileReader(fileName);
        } catch (FileNotFoundException e) {
            fail();
        }
    }
}
