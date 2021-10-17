package Misc.DSA;

public class InsertionSort {
    /*
    Worst complexity: n^2
    Average complexity: n^2
    Best complexity: n
    Space complexity: 1
    Method: Insertion
    Stable: Yes
    Class: Comparison sort
    starting from 0th index we assume left part of array is always sorted and we have to sort right part elements
    one by one by putting them in correct place.
     */
    public static void main(String[] args) {
        insertion(new int[]{20, 15, 2, 9, 33},5);
    }
    public static void insertion(int a[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
