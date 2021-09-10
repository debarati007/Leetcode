package Misc.DSA;

import java.util.HashMap;
import java.util.Map;

public class PerfectPair {
    public static void main(String[] args) {
        perfectSubstring("1221221121",3);
    }
    public static int perfectSubstring(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), (map.get(s.charAt(i))+1));
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==k){
                count++;
            }
        }
        System.out.println(count);
        return count;

    }

}

