package Misc.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Calculate freq of character in a string using java 8 stream api
public class Problem4 {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a','a','c','a','d');
        Map<Character,Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
