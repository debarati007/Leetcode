package Misc.DSA;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(10056, 0));
    }

    private static int countZero(int n, int count) {
        if (n % 10 == n)
            return count;
        if (n % 10 == 0)
            return countZero(n / 10, count + 1);
        else
            return countZero(n / 10, count);
    }
}
