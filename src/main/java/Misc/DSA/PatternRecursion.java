package Misc.DSA;

public class PatternRecursion {
    public static void main(String[] args) {
        print(0, 0);
    }

    static void printRev(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            System.out.print("*");
            printRev(r, c + 1);

        } else {
            System.out.println();
            printRev(r - 1, 0);
        }
    }
     static void print(int r,int c){
        if(r==4)
            return;
        if(c<r){
            System.out.print("*");
            print(r,c+1);
        }
        else{
            System.out.println();
            print(r+1,0);
        }
     }

}
