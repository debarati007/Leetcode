package Misc.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumDifficult {
    //Each number in candidates may only be used once in the combination.
    //Note: The solution set must not contain duplicate combinations.
    //Combination should be in sorted order
    //same as previous but we can use a hashset to store result and later convert this to list<listinteger>>
    //tc and sc is too much
    //so we have to modify the recursion

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);//we need result in sorted order
        findCombination(0, candidates, target, result, new ArrayList<>());
        return result;
    }
    public void findCombination(int currentIndex, int[] candidates, int target, List<List<Integer>> result, List<Integer> ds) {

        if (target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }
        for (int i = currentIndex; i < candidates.length; i++) {
            if (i > currentIndex && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target)
                break;
            ds.add(candidates[i]);
            findCombination(i + 1, candidates, target - candidates[i], result, ds);
            ds.remove(ds.size() - 1);//once recursion completed this element should notnbe picked again.
        }
    }
}
