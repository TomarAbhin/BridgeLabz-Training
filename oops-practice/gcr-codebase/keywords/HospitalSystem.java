public class HospitalSystem {

    // static variables
    static String hospitalName = "Apollo Medics";
    static int totalPatients = 0;

    // initialize instance variables
    String name;
    int age;
    String ailment;
    final int patientID;   // final keyword  variable for unique patient id

    // constructor 
    HospitalSystem(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;   // increment total patients when a new patient is created
    }

    // static method to display total patients admitted
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // method to display patient details using instanceof
    void display(Object obj) {
        if (obj instanceof HospitalSystem) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
    public static void main(String[] args) {

        // creating patient objects
        HospitalSystem p1 = new HospitalSystem("Abhinav", 23, "fever", 105);
        HospitalSystem p2 = new HospitalSystem("Abhay", 28, "fracture", 109);

        HospitalSystem.getTotalPatients();

        p1.display(p1);
        p2.display(p2);

        
    }
}
