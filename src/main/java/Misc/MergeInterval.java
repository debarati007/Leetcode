package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    //TC o(nlogn). It sorts the input based on first array element and then takes the first array in result array as start and end.
    //It then compares the previous values(res array) with current range(input) and stores the result.
    public static void main(String args[]){
        int[][] input= {{0,5},{0,7}};
        merge(input);
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                res.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);


    }

}
