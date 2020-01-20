package WordFrequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordFrequency {

    public static void main(String[] args) {
        wordFrequency(2);
    }

    public static void wordFrequency(int frequency) {

        List<String> lines = null;
        try {
            Path filePath = Paths.get("src/WordFrequency/input.txt");
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("file is not read");
            System.exit(2);
        }

        HashMap<String, Integer> wordsByFreqency = new HashMap<>();
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (wordsByFreqency.containsKey(word)) {
                    wordsByFreqency.put(word, wordsByFreqency.get(word) + 1);
                } else {
                    wordsByFreqency.put(word, 1);
                }
            }
        }

        ArrayList<String> matchingWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsByFreqency.entrySet()) {
            if (entry.getValue() == frequency){
                matchingWords.add(entry.getKey());
            }
        }

        List<String> content = new ArrayList<>();
        if (matchingWords.size() > 0){
            content.add(String.join(", ", matchingWords));
        }
        try {
            Path filePath = Paths.get("src/WordFrequency/output.txt");
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("could not write the file");
            System.exit(1);
        }
    }
}
