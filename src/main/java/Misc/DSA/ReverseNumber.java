package Misc.DSA;

public class ReverseNumber {
    //supports negative number too

    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10 + pop;

        }
        return reverse;
    }
}
