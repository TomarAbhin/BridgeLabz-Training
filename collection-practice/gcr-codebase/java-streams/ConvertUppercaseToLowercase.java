import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ConvertUppercaseToLowercase {
        public static void main(String[] args) {
        String sourceFile = "E:\\TextFiles(java)\\input.txt";
        String destinationFile = "E:\\TextFiles(java)\\output.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            //reading from source file
            reader = new BufferedReader(new FileReader(sourceFile));

            //writing to destination file
            writer = new BufferedWriter(new FileWriter(destinationFile));

            int ch;
            while ((ch = reader.read()) != -1) {
                //convert character to lowercase
                writer.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted successfully (uppercase to lowercase).");

        } catch (IOException e) {
            System.out.println("Error occurred while processing the file.");
            e.printStackTrace();

        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
                if (writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}


