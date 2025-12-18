public class DividePens {
    public static void main(String[] args) {
        int pens = 14; // input total number of pens
        int stu = 3; // input number of students
        int penperstudent = pens / stu; // calculate pens per student
        int remaining = pens % stu; // calculate remaining pens
        System.out.println("Each student gets: " + penperstudent + " pens and the remining pens are: " + remaining);
    }
    
}
