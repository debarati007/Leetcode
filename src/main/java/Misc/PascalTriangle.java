package Misc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    //Formula for element in a particular row and col- (r-1)C(c-1)
    //eg: for 5th row and 3rd col, 4C2.
    //print nth row.

    public static void main(String args[]){
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        // Base case; first row is always [1]
        res.get(0).add(1);
        for (Integer i = 1; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            List<Integer> prev = res.get(i - 1);
            // The first row element is always 1.
            rows.add(1);
            for (Integer j = 1; j < i; j++) {
                // Each triangle element (other than the first and last of each row)
                // is equal to the sum of the elements above-and-to-the-left and
                // above-and-to-the-right.
                rows.add(prev.get(j - 1) + prev.get(j));
            }
            // The last row element is always 1.
            rows.add(1);
            res.add(rows);
        }
        return res;
    }
}
