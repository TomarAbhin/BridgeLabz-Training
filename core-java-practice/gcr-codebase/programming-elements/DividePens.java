public class DividePens {
    public static void main(String[] args) {
        int pens = 14; // input total number of pens
        int students = 3; // input number of students
        int penPerStudents = pens/students; // calculate pens per student
        int remaining = pens%students; // calculate remaining pens
        System.out.println("Each student gets: " + penPerStudents + " pens and the remining pens are: " + remaining);
    }
    
}
