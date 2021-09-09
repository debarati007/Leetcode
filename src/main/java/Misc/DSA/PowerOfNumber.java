package Misc.DSA;

public class PowerOfNumber {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -10;
        System.out.println("Brute force:" + bfPow(x, n));
        System.out.println("optimized:" + optimizedPow(x, n));

    }

    //brute force with time complexity O(n) and constant space complexity.
    private static double bfPow(double x, int n) {
        double res = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                res = res * x;
            }
            return res;
        } else if (n < 0) {
            for (int i = 1; i <= Math.abs(n); i++) {
                res = res * (1 / x);
            }
            return res;
        }
        return res;
    }

    //o(log n) solution
    //using recursion
    //number^0=1
    //2^10=(2*2)^5 for even power we can divide the power to half and number*2
    //(2*2)^5=2*(4)^4=2*(4*4)^2 so for odd power ,number*we can divide the power to half and number*2
    //follow this logic and keep breaking till we reach base case
    private static double optimizedPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return fastPow(x, n);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = fastPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
