class Student {    //node class representing each student record
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;   // Reference to next node
  
    Student(int rollNo, String name, int age, char grade) { //constructor
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {    //singly Linked List class

    Student head;   //head points to first student record

    void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = head;   //new node points to old head
        head = newNode;        //head updated to new node
    }

    void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);

        //if list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        //traverse till last node
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;  //attach new node at end
    }

    void addAtPosition(int position, int rollNo, String name, int age, char grade) {

        //if position is first
        if (position <= 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Student newNode = new Student(rollNo, name, age, grade);
        Student temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return; 
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByRollNo(int rollNo) {

        //if list is empty
        if (head == null) return;

        //if first node is to be deleted
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        Student temp = head;

        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        //if found, remove node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    //search student by roll number
    void searchStudent(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println(temp.rollNo + " | " + temp.name + " | " + temp.age + " | " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    //update grade of a student
    void updateGrade(int rollNo, char newGrade) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    void display() {
        Student temp = head;

        while (temp != null) {
            System.out.println( temp.rollNo + " | " +temp.name + " | " +temp.age + " | " +temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        //adding students
        list.addAtBeginning(1, "Abhay", 21, 'A');
        list.addAtEnd(2, "Bharat", 24, 'B');
        list.addAtEnd(3, "Abhinav", 22, 'B');
        list.addAtPosition(2, 4, "Riya", 22, 'C');
        System.out.println("Student Records:");
        list.display();

        //search student
        System.out.println("\nSearching Roll No 3:");
        list.searchStudent(3);

        //update grade
        System.out.println("\nUpdating Grade of Roll No 3:");
        list.updateGrade(3, 'A');
        list.display();

        //delete a student
        System.out.println("\nDeleting Roll No 1:");
        list.deleteByRollNo(1);
        list.display();
    }
}
