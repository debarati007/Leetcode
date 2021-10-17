package Misc.DSA;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    //one way is to sort the array and return the n-k th element which is the kth largest in the sorted array
    //complexity O(n*log(n))
    public int findKthLargestbf(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{5,8,2,15,4},3));

    }
    //using max heap : Convert input to max heap, pop it k times, O(n+klog(n))
   // Simple Rule : To find kth min element use Max Heap ; to find kth max Element use Min Heap

    private static int size=0;
    public static int findKthLargest(int[] nums, int k) {
        size = nums.length;
        heapify(nums);
        for(int i=0; i<k-1; i++)
            delete(nums);
        return nums[0];
    }

    static void heapify(int[] nums){
        for(int i=size/2 -1; i>=0; i--){
            percolateDown(nums, i);
        }
    }

    static void delete(int nums[]){
        nums[0] = nums[size-1];
        size--;
        percolateDown(nums, 0);
    }

    static void percolateDown(int nums[], int index){
        while(index < size){
            int max = index;
            if(getLeft(index) != -1 && nums[getLeft(index)] > nums[max])
                max = getLeft(index);
            if(getRight(index) != -1 && nums[getRight(index)] > nums[max])
                max = getRight(index);

            if(max != index){
                swap(max, index, nums);
                index = max;
            }
            else break;
        }
    }
    static void swap(int indexA, int indexB, int arr[]){
        int temp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = temp;
    }
    static int getLeft(int index){
        return (index*2 + 1) >= size ? -1 : (index*2 + 1);
    }
    static int getRight(int index){
        return (index*2 + 2) >= size ? -1 : (index*2 + 2);
    }

}
