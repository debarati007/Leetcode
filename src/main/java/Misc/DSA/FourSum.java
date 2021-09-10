package Misc.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target_2 = target - nums[j] - nums[i];
                int front = j + 1;
                int back = n - 1;
                while (front < back) {
                    int two_sum = nums[front] + nums[back];
                    if (two_sum < target_2) front++;
                    else if (two_sum > target_2) back--;
                    else {
                        List<Integer> quad = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[front], nums[back]));
                        res.add(quad);
                        while (front < back && nums[front] == quad.get(2)) ++front;
                        while (front < back && nums[back] == quad.get(3)) --back;
                    }
                }
                while (j + 1 < n && nums[j + 1] == nums[j]) ++j;
            }
            while (i + 1 < n && nums[i + 1] == nums[i]) ++i;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
    }
}
