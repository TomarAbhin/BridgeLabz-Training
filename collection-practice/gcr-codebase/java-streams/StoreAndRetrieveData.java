import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class StoreAndRetrieveData {
    public static void main(String[] args) {
        String filePath = "E:/TextFiles(java)/studentData.bin";
        Scanner scanner = new Scanner(System.in);
        //taking student input
        System.out.print("enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); //consume newline

        System.out.print("enter Name: ");
        String name = scanner.nextLine();

        System.out.print("enter CGPA: ");
        double cgpa = scanner.nextDouble();

        //write data to binary file
        writeStudentData(filePath, rollNo, name, cgpa);

        //read data from binary file
        readStudentData(filePath);
    }

    //method to write data using DataOutputStream
    private static void writeStudentData(String filePath, int rollNo, String name, double cgpa) {
        try (DataOutputStream dos =new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(cgpa);
            System.out.println("\nStudent data written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing student data.");
            e.printStackTrace();
        }
    }

    //method to read data using DataInputStream
    private static void readStudentData(String filePath) {
        try (DataInputStream dis =new DataInputStream(new FileInputStream(filePath))) {
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double cgpa = dis.readDouble();
            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + cgpa);

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
            e.printStackTrace();
        }
    }
}


