//node class representing each task in the circular linked list
class Task {
    int taskId;
    String taskName;
    String priority;
    String dueDate;

    Task next;

    //constructor 
    Task(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;           
        this.taskName = taskName;       
        this.priority = priority;       
        this.dueDate = dueDate;         
        this.next = null;               
    }
}

//circular Linked List class for task scheduler
class TaskScheduler {

    private Task head;      
    private Task current;   

    //add task at beginning of circular list
    void addAtBeginning(int id, String name, String priority, String date) {

        Task node = new Task(id, name, priority, date);

        // If list is empty
        if (head == null) {
            head = node;
            node.next = head;   // circular link
            current = head;
            return;
        }

        Task temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        node.next = head;   
        temp.next = node;   
        head = node;        
    }

    //add task at end of circular list
    void addAtEnd(int id, String name, String priority, String date) {

        Task node = new Task(id, name, priority, date);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        Task temp = head;

        
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;   
        node.next = head;   
    }

    //add task at specific position 
    void addAtPosition(int pos, int id, String name, String priority, String date) {

        if (pos <= 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        Task temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        Task node = new Task(id, name, priority, date);

        node.next = temp.next;  
        temp.next = node;
    }

    //remove task by Task ID
    void removeByTaskId(int id) {

        if (head == null)
            return;

        Task temp = head;
        Task prev = null;

        do {
            if (temp.taskId == id) {

                if (temp == head && temp.next == head) {
                    head = null;
                    current = null;
                    return;
                }
                if (temp == head) {
                    Task last = head;

                    while (last.next != head) {
                        last = last.next;
                    }

                    head = head.next;     
                    last.next = head;     
                    current = head;
                }
                
                else {
                    prev.next = temp.next;
                }
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    
    void viewCurrentAndMoveNext() {

    
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

    
        System.out.println("Current Task:");
        printTask(current);

        current = current.next;
    }

    
    void displayAllTasks() {

        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        Task temp = head;

        System.out.println("All Tasks:");

        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(String priority) {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    //method to print task details
    private void printTask(Task t) {
        System.out.println("ID: " + t.taskId +", Name: " + t.taskName +", Priority: " + t.priority +", Due Date: " + t.dueDate);
    }
}

public class TaskSchedulerSystem {

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtBeginning(1, "Assignment", "High", "10-Oct");
        scheduler.addAtEnd(2, "Project", "Medium", "20-Oct");
        scheduler.addAtEnd(3, "Exam Prep", "High", "15-Oct");
        scheduler.addAtPosition(2, 4, "Meeting", "Low", "08-Oct");

        scheduler.displayAllTasks();

        System.out.println("\nTask Rotation:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nSearch High Priority Tasks:");
        scheduler.searchByPriority("High");
        System.out.println("\nRemove Task ID 2:");
        scheduler.removeByTaskId(2);
        scheduler.displayAllTasks();
    }
}
