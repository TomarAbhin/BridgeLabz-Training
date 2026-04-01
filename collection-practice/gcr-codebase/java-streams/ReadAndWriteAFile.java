import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ReadAndWriteAFile {
    public static void main(String[] args) {
        String sourceFile = "E:\\TextFiles(java)\\SampleFile.txt";
        String destinationFile = "E:\\TextFiles(java)\\DestinationFile.txt";

        readAndWriteFile(sourceFile, destinationFile);
    }

    //method to read and write file
    public static void readAndWriteFile(String source, String destination) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File(source);
            //check if source file exists
            if (!file.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }
            fis = new FileInputStream(file);
            fos = new FileOutputStream(destination); //creates file if not exists
            int data;
            //read and write byte by byte
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading/writing file.");
            e.printStackTrace();

        } finally {
            try {
                if (fis != null){ 
                    fis.close();
                }
                if (fos != null){ 
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing streams.");
            }
        }
    }
}


