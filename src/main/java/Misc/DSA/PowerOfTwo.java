package Misc.DSA;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n%2!=0 || n==0)
            return false;
        if(n==2)
            return true;
        return isPowerOfTwo(n/2);

    }
}
