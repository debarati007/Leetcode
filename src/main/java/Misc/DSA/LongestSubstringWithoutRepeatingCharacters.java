package Misc.DSA;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String input = "pwwkew";
        String longestSubstring = getLongestSubstring(input, 0);
    }
//incomplete brute force solution
//this function recursively prints all substrings
//to remove duplicate I can run a while loop and increase i if charAt(i-1) is same as charAt(i)
//I can store all of the substrings in a hash map and the length of substrings in value
//iterating it I can return the highest length and value afterwards
    //tc and sc is not good

    private static String getLongestSubstring(String input, int counter) {
        String target = input.substring(counter);
        if (target == null || target.length() == 0)
            return "end";
        String s = "";
        for (int i = 0; i < target.length(); i++) {
            s += target.charAt(i);
            System.out.println(s);
        }
        return getLongestSubstring(input, counter + 1);
    }

    //optimised
    //
}
