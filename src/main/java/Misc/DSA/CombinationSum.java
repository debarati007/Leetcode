package Misc.DSA;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    //each number in array can appear multiple times

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(0, candidates, target, result, new ArrayList<>());
        return result;

    }

    public void findCombination(int currentIndex, int[] candidates, int target, List<List<Integer>> result, List<Integer> ds) {

        if (currentIndex == candidates.length) {
            if (target == 0) {
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if (candidates[currentIndex] <= target) {
            ds.add(candidates[currentIndex]);
            findCombination(currentIndex, candidates, target - candidates[currentIndex], result, ds);
            ds.remove(ds.size() - 1);//when backtracking,the last element should not be picked this time as it was picked before.
        }
        findCombination(currentIndex + 1, candidates, target, result, ds);
    }
}
