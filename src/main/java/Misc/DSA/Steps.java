package Misc.DSA;

public class Steps {
    public int numberOfSteps(int num) {
        return numberOfSteps(num,0);
    }
    private int numberOfSteps(int n,int step){
        if(n==0)
            return step;
        if(n%2==0)
            return numberOfSteps(n/2,step+1);
        else
            return numberOfSteps(n-1,step+1);
    }
}
