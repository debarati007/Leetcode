package Misc.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String input = "pwwkew";
        int longestSubstring = lengthOfLongestSubstring(input);
        System.out.println(longestSubstring);
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
    //here we have 2 pointers left and right.
    //both are at 0 initially
    //next we keep adding all characters one by 1 in map and its index as value.
    //at the same time calculate the maxLength which is right-left+1
    //if the chracter already exixts in map,then we need to get new range as its repeated in the left to right range.
    //so we move left pointer to repeated charater's index+1 and continue.
    //finally when right pointer reaches length of string,we return the maxLength;
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0;
        int n=s.length();
        int len=0;

        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            len=Math.max(len,right-left+1);
            right++;
        }

        return len;
    }
}
