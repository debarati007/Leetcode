package Misc.DSA;

public class RotatedBinarySearch {
    //if array[start] less than mid = array is sorted
    //if key is less than start and greater than mid=search in that range
    //if target outside this window ,search in mid+1 to high.
    //if start greater than mid=do same thing but check in second half of array else first half check
    //[5,6,1,2,3,4] =key is 3

    public static void main(String[] args) {
        System.out.println(binarySeacrh(new int[]{5, 6, 7, 8, 9, 1, 2, 3}, 0, 7, 6));
    }

    public static int binarySeacrh(int a[], int start, int end, int target) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (a[mid] == target) {
            return mid;
        }
        if (a[start] <= a[mid]) {
            if (target >= a[start] && target <= a[mid]) {
                return binarySeacrh(a, start, mid - 1, target);
            } else {
                return binarySeacrh(a, mid + 1, end, target);
            }
        }
        if (target >= a[mid] && target <= a[end]) {
            return binarySeacrh(a, mid + 1, end, target);
        }

        return binarySeacrh(a, start, mid - 1, target);

    }

}
