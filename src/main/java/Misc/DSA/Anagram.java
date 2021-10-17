package Misc.DSA;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    //bf solution using a map.
    //sc-O(n) tc O(n)
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }else
                return false;
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()!=0)
                return false;
        }
        return true;
    }

    //using letter array
    public boolean isAnagramOptimised(String s, String t) {
        int[] letter = new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            letter[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            letter[t.charAt(i)-'a']--;
        }
        for(int i=0;i<letter.length;i++){
            if(letter[i]!=0)
                return false;
        }
        return true;

    }


}
