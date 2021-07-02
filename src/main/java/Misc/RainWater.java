package Misc;

class RainWater {
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
    public static void main(String args[]){

    }
}









