package Misc;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int index=binarySearch(start,end,target,nums);
        return index;

    }
    public int binarySearch(int start,int end,int target,int[] nums){
        if(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return binarySearch(start,mid-1,target,nums);
            }
            return binarySearch(mid+1,end,target,nums);
        }
        return -1;
    }
}
