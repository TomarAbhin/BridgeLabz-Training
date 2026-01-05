import java.util.*;
public class InvertAMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> Map1 = new HashMap<>();
        //input number of entries
        System.out.print("enter number of entries: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("enter key: ");
            String key = s.next();

            System.out.print("enter value: ");
            int value = s.nextInt();

            Map1.put(key, value);
        }
        //invert the map
        Map<Integer, List<String>> invertedMap = invertMap(Map1);
        System.out.println("Inverted Map: " + invertedMap);
    }

    //method to invert the map
    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            //if value not present, create new list
            invertedMap.putIfAbsent(value, new ArrayList<>());
            //add key to the list
            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }
}

