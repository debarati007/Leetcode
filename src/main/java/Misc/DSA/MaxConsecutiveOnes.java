package Misc.DSA;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
    //time complexity O(n) and using 2 pointers.
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int j;
        for (int i = 0; i < nums.length; i++) {
            int max_so_far = 0;

            if(nums[i]==1) {
                j=i;
                while (j<nums.length && nums[j] == 1  ) {
                    max_so_far++;
                    j++;
                }
                i=j-1;
            }
            max = Math.max(max_so_far, max);
        }
        return max;
    }
}
