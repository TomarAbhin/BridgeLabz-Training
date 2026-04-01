import java.util.*;
public class ConvertSetToSortedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter number of elements: ");
        int n = s.nextInt();

        Set<Integer> set = new HashSet<>();  //initialize the set

        System.out.println("enter elements of the Set:");
        for (int i = 0; i < n; i++) {
            set.add(s.nextInt());
        }

        System.out.println("Original Set: " + set);

        List<Integer> sortedList = convertToSortedList(set);  //call the method

        System.out.println("Sorted List: " + sortedList);
    }

    //method for conversion of set to sorted list
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Convert Set to List
        List<Integer> list = new ArrayList<>(set);

        // Sort list in ascending order
        Collections.sort(list);

        return list;
    }
}


