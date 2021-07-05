package Misc;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
    public static void main(String args[]){
        int coins[] = {1,2,3};
        System.out.print(coinChange(coins,11));
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
}
