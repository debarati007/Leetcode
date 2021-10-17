package Misc.DSA;

public class RearrangeArryBasedOnGivenElement {
    public static void main(String[] args) {
        int a[]={1,6,7,3,5,9,0};
        int key=6;
        int index=0;
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                index=i;
            }
        }

        for(int i=0;i<a.length;i++){
            if((a[i]>a[index] && index<i) || (a[i]<a[index] && index>i)){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
