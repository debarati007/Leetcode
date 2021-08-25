package Misc.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given list of number "1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9"
//Store all unique numbers in a list
public class Problem2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        List<Integer> filteredList=list.stream().distinct().collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
