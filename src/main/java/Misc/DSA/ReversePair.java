package Misc.DSA;

import java.util.ArrayList;

public class ReversePair {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,3,1};
//{20,6},{20,4},{20,5},{6,4},{6,5}
        ReversePair reversePair=new ReversePair();
        System.out.println(
                reversePair.mergeSort(arr, 0, arr.length - 1));
//        System.out.println(
//                mergeSortAndCountBF(arr, arr.length));
    }

    private static int mergeSortAndCountBF(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2*arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
//optimised solution using merge sort
//breaking the array in left and right part
//while merging we compare left and right.Since it is sorted then for each number in right sub array, if it fulfills this condition ->nums[i]>2*((long)nums[j]) ,
// all number in its left will also make a pair with the right subarray number
//so total count is count of such pair in left+count of such pair in right subarray+count of pair we got while merging.
//TC will be order of O(nlogn)

    private int mergeSort(int[] nums, int low, int high){
        if(low>=high)
            return 0;
        int mid=(low+high)/2;
        int inversePair=mergeSort(nums,low,mid);
        inversePair+=mergeSort(nums,mid+1,high);
        inversePair+=countAndMerge(nums,low,mid,high);
        return inversePair;
    }
    private int countAndMerge(int[] nums, int low, int mid, int high){
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>2*((long)nums[j])){
                j++;
            }
            count+= j-(mid+1);
        }
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }
        while(left<=mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
        return count;
    }
}
