import java.io.*;
import java.util.*;
class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 140);
        hm.put("US", 40);
        System.out.println(hm);

        hm.put("UK", 80);
        System.out.println(hm);
        
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nigeria"));

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String key: hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }

    }
}
