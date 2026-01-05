import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input Map 1
        System.out.print("enter number of entries in Map 1: ");
        int n1 = s.nextInt();
        Map<String, Integer> map1 = readMap(s, n1);
        //input Map 2
        System.out.print("enter number of entries in Map 2: ");
        int n2 = s.nextInt();
        Map<String, Integer> map2 = readMap(s, n2);

        //merge maps
        Map<String, Integer> mergedMap = mergeMaps(map1, map2);
        System.out.println("Merged Map: " + mergedMap);
    }

    // method to read maps
    public static Map<String, Integer> readMap(Scanner s, int n) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("enter key: ");
            String key = s.next();

            System.out.print("enter value: ");
            int value = s.nextInt();

            map.put(key, value);
        }

        return map;
    }

    //method to merge two maps
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1,Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            //if key exists, add values
            result.put(key, result.getOrDefault(key, 0) + value);
        }

        return result;
    }
}
