package Misc.DSA;

public class BubbleSort {
    /*
    Worst complexity: n^2
    Average complexity: n^2
    Best complexity: n
    Space complexity: 1
     */
    public static void main(String[] args) {
        bubble(new int[]{20, 15, 2, 9, 33});
    }

    public static void bubble(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
