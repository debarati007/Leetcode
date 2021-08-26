package Misc.DSA;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;


public class NextPermutation {
    public static void main(String args[]){
        nextPermutation(new int[]{3,2,1});

    }
    public static void nextPermutation(int[] nums) {
        int[] copiedArray = new int[nums.length];
        System.arraycopy(nums, 0, copiedArray, 0, nums.length);        Arrays.sort(nums);
        int[] reverseArr = IntStream.rangeClosed(1, nums.length).map(i -> nums[nums.length-i]).toArray();
        //int[] a=IntStream.rangeClosed()
        if(Arrays.equals(reverseArr,copiedArray)){
            Arrays.sort(nums);
        }
        else{
            Arrays.sort(nums);
            int temp=nums[nums.length-2];
            nums[nums.length-2]=nums[nums.length-1];
            nums[nums.length-1]=temp;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
