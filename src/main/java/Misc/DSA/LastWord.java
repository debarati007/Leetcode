package Misc.DSA;

public class LastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("H ello "));
    }

    public static int lengthOfLastWord(String s) {
            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (i == s.length() - 1) {
                    while (s.charAt(i) == ' ') {
                        i--;
                    }
                }
                if (s.charAt(i) != ' ') {
                    while (s.charAt(i) != ' ' && i > 0) {
                        i--;
                        count++;
                    }
                    if (i == 0 && s.charAt(i) != ' ') count++; //for edge case : i=-1 will break prev for loop.
                    return count;
                }
            }
            return count;
    }
}
