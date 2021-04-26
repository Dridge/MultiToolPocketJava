package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWriter {
    public void writeTextToFile(String textToWrite, String fileName) {
        try (FileOutputStream outputStream = new FileOutputStream(fileName, true)) {
            byte[] inputAsBytes = textToWrite.getBytes();
            outputStream.write(inputAsBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeTextToFile() {
        Scanner scanner = new Scanner(System. in );
        // Replace with proper interactive console msg
        System.out.println("Name the file you want to write to, including absolute directory if not in current directory: ");
        String input = scanner.nextLine();
        try (FileOutputStream outputStream = new FileOutputStream(input, true)) {
            System.out.println("Add text you want to write, use enter to update file: ");
            input = scanner.nextLine() + "\n";
            byte[] inputAsBytes = input.getBytes();
            outputStream.write(inputAsBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
