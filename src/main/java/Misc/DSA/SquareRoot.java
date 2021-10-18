package Misc.DSA;

public class SquareRoot {
    //brute force
    //we need to look for an i for which i*i<=x && (i+1)*(i+1)>x
    public int mySqrt(int x) {
        if (x == 0) return 0;
        for(int i=1;i<x;i++){
            if(i*i<=x && (i+1)*(i+1)>x)
                return i;
        }
        return -1;
    }
    //O(log n) solution.
    //Known as Newton's rule
    public int mySqrtOptimised(int x) {
        if (x == 0) return 0;
        long i =x;
        while(i>x/i){
            i=(i+x/i)/2;
        }
        return (int)i;
    }
}
