package Misc.DSA;

public class Sort012 {
    public static void main(String args[]){
        int nums[] = {2,0,1};
        sortColorsOptimised(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }

    }
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                a++;
            else if(nums[i]==1)
                b++;
            else if(nums[i]==2)
                c++;
        }
        System.out.println(a +" "+b+" "+c);

        for(int i=0;i<a;i++){
            nums[i]=0;
        }
        for(int i=a;i<(a+b);i++){
            nums[i]=1;
        }
        for(int i=(a+b);i<(a+b+c);i++){
            nums[i]=2;
        }

    }
//Dutch National Flag Algorithm
//take 3 pointers,low,mid,high
//initialise mid and low =0 and high=n-1.
//we need to make sure 0 to low-1 are all 0 and high to n-1 are all 2.
//traverse the array till mid<=high
//if a[mid]=0,swap a[low] and a[mid],mid++,low++
//if a[mid]=1,mid++
// if a[mid]=2,swap a[mid] and a[high],high--.

    public static void sortColorsOptimised(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    swap(low,mid,nums);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid,high,nums);
                    high--;
                    break;
            }
        }
    }
    public static void swap(int a, int b, int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
