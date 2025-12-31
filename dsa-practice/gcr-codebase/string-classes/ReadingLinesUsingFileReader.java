import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadingLinesUsingFileReader {
    public static void main(String[] args) {
        String filePath = "E:\\SampleFile.txt"; //file to be read
        try {
            //create FileReader
            FileReader fr = new FileReader(filePath);
            //wrap FileReader with BufferedReader
            BufferedReader br = new BufferedReader(fr);
            String line;
            //read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


