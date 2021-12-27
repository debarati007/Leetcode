package Misc.DSA;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 18, 9}, 18, 4));

    }

    private static boolean search(int[] arr, int key, int index) {
        if(index==-1)
            return false;
        if(arr[index]==key)
            return true;
        else
            return search(arr,key,index-1);
    }
}
