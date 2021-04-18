package files;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class FileCreatorTest {
    @Test
    public void testFileIsCreated() {
        FileCreator fileCreator = new FileCreator();
        assertTrue(fileCreator.createFile("testFile"));
        checkFileExists();
    }

    private void checkFileExists() {
        try {
            new FileReader("testFile");
        } catch (FileNotFoundException e) {
            fail();
        }
    }
}
