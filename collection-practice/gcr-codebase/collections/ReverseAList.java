import java.util.*;
public class ReverseAList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of elements: ");
        int n = s.nextInt();

        List<Integer> arrayList = new ArrayList<>();    // input in arraylist
        System.out.println("enter elements for ArrayList:");

        for (int i = 0; i < n; i++) {
            arrayList.add(s.nextInt());
        }

        System.out.println("Original ArrayList: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();  // input in linkedlist
        System.out.println("enter elements for LinkedList:");

        for (int i = 0; i < n; i++) {
            linkedList.add(s.nextInt());
        }

        System.out.println("Original LinkedList: " + linkedList);
        LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);

    }
        //method to reverse arraylist
    public static void reverseArrayList(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    //method to reverse the linkedlist
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer value : list) {
            reversedList.addFirst(value);
        }
        return reversedList;
    }
}


