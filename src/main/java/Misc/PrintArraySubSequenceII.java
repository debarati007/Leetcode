package Misc;

import java.util.ArrayList;
import java.util.List;

public class PrintArraySubSequenceII {
    //prints all the subseta inclusing empty set
    //in recursion,starting from index 0,once adding a number in list,calling recursion with next inxdex
    //next time removing that number from list and calling recurion again with next index.
    // Hence including all probable subsets
    static List<List<Integer>> result=null;
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> res = new ArrayList<>();
        result = new ArrayList<>();
        sets(0,nums,res);

        return result;

    }

    public static void sets(int i,int[] nums,List<Integer> res){
        if(i==nums.length){
            result.add(new ArrayList(res));
            return ;
        }
        res.add(nums[i]);
        sets(i+1,nums,res);
        int index = res.size()-1;
        res.remove(index);
        sets(i+1,nums,res);
        return ;
    }
}
