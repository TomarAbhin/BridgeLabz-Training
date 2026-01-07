import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CountWordsInAFile {
    public static void main(String[] args) {
        String filePath = "E:/TextFiles(java)/input.txt";
        File file = new File(filePath);
        //check if file exists
        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }
        Map<String, Integer> count = new HashMap<>();

        //read the file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                //convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        count.put(word, count.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
            return;
        }

        //check if file was empty
        if (count.isEmpty()) {
            System.out.println("File is empty or contains no valid words.");
            return;
        }

        //sort words by frequency
        List<Map.Entry<String, Integer>> sortedList =new ArrayList<>(count.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        //display top 5 frequent words
        System.out.println("Top 5 Most Frequent Words:");
        int counter = 0;

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            counter++;
            if (counter == 5) break;
        }
    }
}


