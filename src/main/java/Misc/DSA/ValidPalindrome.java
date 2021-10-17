package Misc.DSA;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')
                    ||(s.charAt(i)>='A' && s.charAt(i)<='Z')
                    ||(s.charAt(i)>='0' && s.charAt(i)<='9'))
                list.add(Character.toLowerCase(s.charAt(i)));
        }

        for(int i=0,j=list.size()-1;i<list.size();i++,j--){
            if(list.get(i)!=list.get(j))
                return false;
        }

        return true;
    }
}
