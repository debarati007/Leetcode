package Misc.Java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> subList = new ArrayList<String>();
        subList.add("Maths");
        subList.add("English");
        subList.add("French");
        subList.add("Sanskrit");
        subList.add("Abacus");
        subList.forEach(i->System.out.println(i));
    }

}
