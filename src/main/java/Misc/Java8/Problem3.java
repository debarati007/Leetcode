package Misc.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Calculate the average of a list of numbers. if the list is empty return 0;
public class Problem3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        OptionalDouble average = list.stream().mapToInt(number->number.intValue()).average();
        System.out.println(average);
    }
}
