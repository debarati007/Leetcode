package Misc.DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CoinChange {
    public static void main(String args[]){
        int coins[] = {1,2,5};
        //System.out.print(coinChange(coins,11));
//        List<List<Integer>> result=coinChange(coins,11);
//        System.out.println(result.size());
//        System.out.println(result);
        System.out.println(coinChangeCount(coins,11));
    }
    public static List<List<Integer>> coinChange(int[] coins,int amount){
        //returns all possible combinations.
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]>amount){
                return result;
            }
            if(coins[i]==amount){
                List<Integer> temp = new ArrayList<>();
                temp.add(coins[i]);
                result.add(temp);
                return result;
            }
            List<List<Integer>> intermediateCombination = coinChange(coins,amount-coins[i]);
            for (List<Integer> combination : intermediateCombination){
                combination.add(coins[i]);
            }
            result.addAll(intermediateCombination);
        }
        return result;
    }


    public static int coinChangeCount(int[] coins, int amount) {
        if(amount < 0) return -1;
        if(amount == 0) return 0;
        int minCoinCount=-1;
        for(int i=0;i<coins.length;i++) {
            int combinations=coinChangeCount(coins, amount-coins[i]);
            if(combinations>=0) {
                minCoinCount= minCoinCount<0 ? combinations+1: Math.min(minCoinCount,combinations+1);
            }
        }
        return minCoinCount;
    }
}
