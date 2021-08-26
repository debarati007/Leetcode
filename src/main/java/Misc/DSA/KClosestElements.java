package Misc.DSA;

import java.util.ArrayList;
import java.util.List;

public class KClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int eqPoint = 0;
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if((i-1)>=0 && (i+1)<arr.length && arr[i-1]<x && arr[i+1]>x){
                pos = i;
                eqPoint = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if((pos-1)>=0 && (pos+1)<arr.length ){
                int a = arr[pos-1];
                int b = arr[pos+1];
                if(Math.abs(a - x) < Math.abs(b - x) || ((Math.abs(a - x) == Math.abs(b - x))&& a < b) ){
                    res.add(a);
                }
                else
                    res.add(b);
            }
        }
        return res;
    }
}