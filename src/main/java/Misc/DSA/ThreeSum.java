package Misc.DSA;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (map.containsKey(nums[j])) {
                    List<Integer> subList = new ArrayList<>(Arrays.asList(nums[i], target - nums[j], nums[j]));
                    if ((res.size() == 0) || !(res.get(res.size() - 1).equals(subList))) {
                        res.add(subList);
                    }
                }
                map.put(target - nums[j], j);
            }
            map.clear();
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}
