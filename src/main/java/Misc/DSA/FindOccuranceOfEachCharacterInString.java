package Misc.DSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOccuranceOfEachCharacterInString {
    public static void main(String[] args) {
        findOccurance("acjhjabbccc");
    }

    private static void findOccurance(String input) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }
            else
                map.put(input.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }
    }
}
