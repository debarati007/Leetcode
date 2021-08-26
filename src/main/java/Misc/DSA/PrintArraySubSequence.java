package Misc.DSA;

import java.util.ArrayList;
import java.util.List;

public class PrintArraySubSequence {
    //{1,2,3} ->{},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}
    //prints all subsets recursively. Does not take care of duplicate case.
    //uses List to store subsets.
    //First stores one element
    //then calls recursion for next index and the list.
    //For printing all subsets,removes 1 element from list then calls the next recursion for same index.
    // So for each index recursion call happens 2 times. Once that element is stored by List and once without it.
    //tc- For each index 2 calls hence for n elements- o(2^n)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res1 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        sets(0,nums,res,res1);
        return res1;
    }
    public static void sets(int i, int[] nums, List<Integer> res, List<List<Integer>> res1){
        if(i==nums.length){
            System.out.println(res);
            // res1.add(res);
            // System.out.println(res1);
            return ;
        }
        res.add(nums[i]);
        sets(i+1,nums,res,res1);
        int index = res.size()-1;
        res.remove(index);
        sets(i+1,nums,res,res1);
        return ;
    }
}
