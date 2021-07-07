package Misc;
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[j] = nums[i];
            if (nums[i] != val) {
                j++;
            }
        }
        return j;
    }
}