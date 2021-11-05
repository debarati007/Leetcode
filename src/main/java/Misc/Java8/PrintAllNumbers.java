package Misc.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        list.stream().forEach(System.out::println);

        //print even number
        list.stream().filter(number->number%2==0 ).forEach(System.out::print);

        //print courses whose name has 5 letters
        List<String> l = Arrays.asList("spring","doc","ajhdjhdb");
        System.out.println("courses:");
        l.stream().filter(s->s.length()>5).forEach(System.out::println);
        //print all which contains "spring" sequence
        System.out.println("print seq:");
        l.stream().filter(s->s.contains("spring")).forEach(System.out::println);
        //print square of all number
        list.stream().filter(i->i>8)
                .map(i->i*i).forEach(System.out::println);
        //print length of each string
        System.out.println("length");
        l.stream().map(s->s.length()).forEach(System.out::println);
        l.stream().map(s->s.length()+" "+s).forEach(System.out::println);

    }

    public static String count(String i) {
         if(i.length()>=5)
             return i;
         return null;

    }
}
