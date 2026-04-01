import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter number of elements: ");
        int n = s.nextInt();

        List<Integer> list = new ArrayList<>();  //initalize the list
        System.out.println("enter list elements:");
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        System.out.println("Original List: " + list);

        List<Integer> result = removeDuplicates(list);  // call the method and store the values in list
        System.out.println("List after removing duplicates: " + result);
    }

    //method to remove duplicates
    public static List<Integer> removeDuplicates(List<Integer> list) {
        //LinkedHashSet removes duplicates & maintains order
        Set<Integer> set = new LinkedHashSet<>(list);

        //convert back to List
        return new ArrayList<>(set);
    }
}


