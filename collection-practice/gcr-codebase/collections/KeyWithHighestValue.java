import java.util.*;
public class KeyWithHighestValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        //input number of entries
        System.out.print("enter number of entries: ");
        int n = s.nextInt();
        //input key-value pairs
        for (int i = 0; i < n; i++) {
            System.out.print("enter key: ");
            String key = s.next();

            System.out.print("enter value: ");
            int value = s.nextInt();

            map.put(key, value);
        }

        String maxKey = findKey(map);  // call the method
        if (maxKey != null) {
            System.out.println("Key with highest value: " + maxKey);
        } else {
            System.out.println("Map is empty");
        }
    }

    //method to find key with max value
    public static String findKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        //traversing map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}


