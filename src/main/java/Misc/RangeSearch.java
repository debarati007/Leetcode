package Misc;

public class RangeSearch {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};

        res[0]=findFirstPosition(0,nums.length-1,target,nums);
        res[1]=findLastPosition(res[0],nums.length-1,target,nums);
        return res;
    }

    public int findFirstPosition(int start,int end,int target,int[] nums){
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                end=mid-1;
                result=mid;
            }
            else if(target<nums[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return result;
    }
    public int findLastPosition(int start,int end,int target,int[] nums){
        int result=-1;
        if(start==-1){
            return result;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                start=mid+1;
                result=mid;
            }
            else if(target<nums[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return result;
    }
}
