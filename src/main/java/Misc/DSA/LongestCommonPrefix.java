package Misc.DSA;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }
//brute force using 2 for loops.
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i) {
                    if (strs[j].charAt(i) != c) return prefix;
                    else count++;
                }
            }
            if (count == strs.length - 1)
                prefix = prefix + c;
        }
        return prefix;
    }
}
