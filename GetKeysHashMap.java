import java.util.*;

public class GetKeysHashMap {
    public static void main(String[] args) {
        // Create a HashMap with some values
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Monday", 5);
        map.put("Tuesday", 6);
        map.put("Wednesday", 10);

        // 1. First Method - Invoke keySet() on the HashMap object to get the keys as a set
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        //2. Second Method - Using KeySet() and toArray() to get an array of keys
        // Create a HashMap with some values
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map.put("Monday", 5);
        map.put("Tuesday", 6);
        map.put("Wednesday", 10);

        // Invoke keySet() and use toArray() to get an array of keys
        Object[] keys1= map1.keySet().toArray();
        for (int i=0; i<keys1.length; i++) {
            System.out.println(keys1[i]);
        }
    }
}

