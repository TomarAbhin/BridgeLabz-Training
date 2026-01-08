import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        String file = "E:\\TextFiles(java)\\SampleFile.txt";

        try {
            readFile(file);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    //method that throws checked exception
    private static void readFile(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}


