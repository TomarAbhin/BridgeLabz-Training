import java.util.*;
public class RotateAList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter number of elements: ");
        int n = s.nextInt();

        List<Integer> list = new ArrayList<>();   // initialize the arraylist

        System.out.println("enter list elements:");
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        System.out.print("enter rotation count: ");
        int k = s.nextInt();

        System.out.println("Original List: " + list);
        rotateList(list, k);
        System.out.println("Rotated List: " + list);

    }

    // method to rotate the list
    public static void rotateList(List<Integer> list, int k) {
        int size = list.size();

        //handle edge cases
        if (size == 0 || k <= 0) {
            return;
        }

        //if rotation count > list size
        k = k % size;

        //store first k elements
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }

        //shift remaining elements to the left
        for (int i = k; i < size; i++) {
            list.set(i - k, list.get(i));
        }

        //add stored elements at the end
        for (int i = 0; i < temp.size(); i++) {
            list.set(size - k + i, temp.get(i));
        }
    }
}


