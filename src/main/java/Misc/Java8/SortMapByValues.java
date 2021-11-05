package Misc.Java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 32);
        map.put(2, 21);
        map.put(5, 29);
        map.put(3, 13);
        map.put(0, 11);
        map.put(9, 90);
        System.out.println("before sorting : " + map.entrySet().toString());
        //using default comparator ascending order
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

        //using compareTo ascending order
        map.entrySet().stream().sorted((k1, k2) -> (k1.getValue().compareTo(k2.getValue()))).
                forEach(k -> System.out.println(k.getKey() + ":" + k.getValue()));

        //using compareTo descending order
        map.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ":" + k.getValue()));

        //ascending order,stroing in a map
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(k -> map.put(k.getKey(), k.getValue()));


        //using linkedHashSet : storing the result in linkedhashmap and printing it
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);

        Map<String, Integer> res = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("res:");
        for (Map.Entry<String, Integer> k : res.entrySet()) {
            System.out.println(k.getKey() + " : " + k.getValue());
        }
    }

}