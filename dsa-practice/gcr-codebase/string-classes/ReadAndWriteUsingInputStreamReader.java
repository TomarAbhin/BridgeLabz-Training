import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteUsingInputStreamReader {
    public static void main(String[] args) {
        String filePath = "E:\\\\SampleFile.txt";

        try {
            //read input from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            //write input to file
            FileWriter writer = new FileWriter(filePath, true); // true for append mode
            System.out.println("Enter text (type 'exit' to stop):");
            String input;
            while (true) {
                input = br.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input + "\n"); // write each input on new line
            }
            writer.close();
            br.close();
            isr.close();

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


