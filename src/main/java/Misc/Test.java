package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String args[]){
        List<Integer> temp = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(temp);
    }

    private static void reverse(List<Integer> temp) {
        if(temp.size()==0)
            return;
        System.out.println(temp.get(temp.size()-1));
        temp.remove(temp.size()-1);
        reverse(temp);
    }
}
