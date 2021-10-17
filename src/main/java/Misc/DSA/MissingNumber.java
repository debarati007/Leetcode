package Misc.DSA;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("missing number is:"+findMissingNumber(new int[]{0,1,4,3}));
    }
    /*
     1) XOR all the elements present in arr[], let the result of XOR be R1.
     2) XOR all numbers from 1 to n, let XOR be R2.
     3) XOR of R1 and R2 gives the missing number.
     */

    private static int findMissingNumber(int[] a) {
        int total=0;
        int inputXor=0;
        for(int i=1;i<=a.length;i++){
            total^=i;
        }
        for(int i=0;i<a.length;i++){
            inputXor^=a[i];
        }
        return total^inputXor;
    }
}
