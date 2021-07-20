package Misc;

import java.util.Arrays;

public class DuplicateAndRepeat {
    //brute-force solution
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
                return nums[i];
        }
        return -1;
    }
    //slightly optimised
    //uses a temp array as map. for each array element,in the temp array in that index element value is increased by 1.
    //traverse the temp array,the index whose value is 0 is the missing number and the index value=2 is duplicate number.
    public int findDuplicateSecond(int[] nums) {
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int index = nums[i];
            temp[index]++;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]>1)
                return i;
        }
        return -1;

    }

    //optimised using XOR
    //XOR all a[i] -> x
    //x^(1^...^n)
    //x^y=num
    //separate a[i] in 2 buckets based on set and unset bits.
    //separate 1 to n in 2 buckets based on set and unset bits.
    //xor those 2 buckets to get the numbers and eliminate other results..
    //number left in set bucket is missing and unset bucket is duplicate.

}
