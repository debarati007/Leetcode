package Misc.Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class FunctionalProgramming {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        long c = hm.entrySet().stream().filter(data -> data.getValue() > 85).count();
        System.out.println(c);
        //create a stream from a file
        //  Stream<String> fileStream= Files.lines(Paths.get("filePath"));
        // fileStream.forEach(line -> //do some thing);
        //map-filter-reduce
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().map(i -> i * i).filter(i -> i > 20).count());
        //optional and reduce custom function
        double sum = hm.entrySet().stream().mapToDouble(k -> k.getValue()).reduce(0.0, (v1, v2) -> v1 + v2);
        System.out.println("sum:" + sum);
    }
}
