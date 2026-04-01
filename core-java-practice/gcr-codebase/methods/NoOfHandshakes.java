import java.util.*;
public class NoOfHandshakes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = s.nextInt();      // Taking input for number of students

        int ans = calculateHandshakes(numberOfStudents);    // Calling method to calculate ans

        System.out.println("the number of handshakes is: " + ans);
    }
    public static int calculateHandshakes(int n) {     // Method to calculate maximum number of handshakes
        return (n*(n-1))/2;  // Using formula : n*(n-1)/2
    }
}


