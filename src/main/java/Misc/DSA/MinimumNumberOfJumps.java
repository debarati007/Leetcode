package Misc.DSA;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
         int result=jump(nums);
        System.out.println(result);
    }
 //we have 2 concepts ladder and stair
   //at each index we get a new ladder
   //size of ladder is the value of of array element at that index
   //stairs: size of ladder is equal to number of stairs in each ladder
    //we can jump from one ladder to another ladder
    //at each index check ladder ,if its large keep it ,if small throw it
    //if current ladder is empty,climb the ladder which is stored.

    public static int jump(int[] a) {
        if(a.length<=1)
            return 0;
        int ladder=a[0];//keep track of largest ladder I have
        int stairs=a[0];//keep track of stair in current ladder
        int jump=1;
        for(int level=1;level<a.length;level++){
            if(level==a.length-1){
                return jump;
            }
            if(level+a[level]>ladder)
                ladder=level+a[level];//build up the ladder
            stairs--;//use up stairs
            if(stairs==0){
                jump++;//no stairs left so jump to next ladder
                stairs=ladder-level;//get new set of ladders
            }

        }
        return jump;
    }
}
