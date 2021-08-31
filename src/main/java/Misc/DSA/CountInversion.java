package Misc.DSA;

import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
//{20,6},{20,4},{20,5},{6,4},{6,5}
//        System.out.println(
//                mergeSortAndCount(arr, 0, arr.length - 1));
        System.out.println(
                mergeSortAndCountBF(arr, arr.length));

    }
    //brute force solution that takes O(n2) time and O(1) space complexity.
    //could be improved to O(nlogn) by applying merge sort and calculating pairs while merging them .
    private static int mergeSortAndCountBF(int[] arr, int n) {
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            // Total inversion count = left subarray count
            // + right subarray count + merge count
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftSubArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightSubArray = Arrays.copyOfRange(arr, mid + 1, right + 1);
        int i = 0;//left array index
        int j = 0;//right array index
        int k = left;
        int swap = 0;
        while (i < leftSubArray.length && j < rightSubArray.length) {
            if (leftSubArray[i] <= rightSubArray[j]) {
                arr[k++] = leftSubArray[i++];
            } else {
                arr[k++] = rightSubArray[j++];
                swap += (mid + 1) - (left + i);
            }
        }
        while (i < leftSubArray.length) {
            arr[k++] = leftSubArray[i++];
        }
        while (j < rightSubArray.length) {
            arr[k++] = rightSubArray[j++];
        }
        return swap;
    }
}

