import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadInputFromUser{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;
        try {
            //taking user input
            System.out.print("enter your name: ");
            String name = br.readLine();

            System.out.print("enter your age: ");
            String age = br.readLine();

            System.out.print("enter your favorite food: ");
            String food = br.readLine();

            //writing data to file
            writer = new FileWriter("E:\\TextFiles(java)\\UserDetails.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite food is: " + food + "\n");

            System.out.println("\nUser details saved successfully to file.");

        } catch (IOException e) {
            System.out.println("Error occurred while reading input or writing file.");
            e.printStackTrace();

        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing FileWriter.");
            }
        }
    }
}


