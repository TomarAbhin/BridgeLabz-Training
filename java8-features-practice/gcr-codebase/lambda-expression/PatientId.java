package lambda_expression;

import java.util.*;

public class PatientId {

    //method referenced in forEach
    public static void printPatientId(Integer id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> patientIds = new ArrayList<>();
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Patient ID " + (i + 1) + ": ");
            patientIds.add(sc.nextInt());
        }

        System.out.println("\nPatient IDs:");

        //method reference 
        patientIds.forEach(PatientId::printPatientId);
    }
}
