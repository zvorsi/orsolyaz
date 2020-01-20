package WordFrequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class wordFrequency {

    public static void main(String[] args) {
        wordFrequency(2);
    }

    public static void wordFrequency(int frequency){

        List<String> lines;
        try {
            Path filePath = Paths.get("src/WordFrequency/input.txt");
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("file is not read");
            System.exit(2);
        }
        
    }
}
