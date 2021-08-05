package Misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class RainWater {
    public static void main(String args[]) throws Exception {
        System.out.println("Hello");
        FileInputStream fis = new FileInputStream("C:\\Users\\debarati.banerjee\\Documents\\debarati\\Leetcode\\src\\main\\resources\\config.properties");
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("password"));

    }
    public static int trap(int[] height) {
        //Time Complexity O(n^2)
        //TODO : need to improve
        int leftMax = 0;
        int rightMax = 0;
        int currValue = 0;
        int water = 0;

        for(int i=0;i<height.length;i++){
            currValue=height[i];
            leftMax = 0;
            rightMax = 0;

            for(int j= 0;j<i;j++){
                leftMax = Math.max(height[j],leftMax);
            }
            for(int k=i+1;k<height.length;k++){
                rightMax = Math.max(height[k],rightMax);
            }
            currValue = Math.min(leftMax,rightMax)-currValue;
            currValue = Math.max(0,currValue);
            water+=currValue;
        }
        return water;
    }
    public static int trap1(int[] height) {
        //step 1 : create an array(rightMax[]) which stores prefix max value for each element in input array;
        //step 2 : iterate over input array and calculate water trapped in each place between left and right;
        //step 3 : if water trapped is in negative,make it 0;
        //step 4 : calculate the left value
        //step 5 : return  total water trapped.
        int rightMax[] = new int[height.length];
        int leftMax=0;
        int water=0;
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i+1],rightMax[i+1]);
        }

        for(int i=0;i<height.length;i++){
            int curr = Math.min(leftMax,rightMax[i])-height[i];
            curr = Math.max(0,curr);
            water+=curr;
            leftMax = Math.max(leftMax,height[i]);
        }
        return water;
    }
}









