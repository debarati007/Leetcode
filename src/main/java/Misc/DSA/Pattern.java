package Misc.DSA;

public class Pattern {
    public static void main(String[] args) {
        patternRecursion(5,5);

    }

    public static void pattern(int r,int c) {
        for (int i = r; i >= 0; i--) {
            for (int j = 0; j <=c-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternRecursion(int r,int c){
        if(r==0)
            return;
        if(c<r) {
            System.out.print("*");
            patternRecursion(r, c -r);
        }
        else {
            System.out.println();
            patternRecursion(r - 1, 5);

        }



    }
}
