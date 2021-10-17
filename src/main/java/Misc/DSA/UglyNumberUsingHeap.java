package Misc.DSA;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UglyNumberUsingHeap {
    //solution uses a HashSet to look up the items inserted into the minHeap, instead of calling the O(n) "minHeap.contains()". The solution's time complexity is O(nlogn).
    /*
    Instead of checking all the numbers we can generate the numbers that we want. Given an ugly number we can generate 3 new numbers by multiplying it with 2, 3 and 5. Suppose we start with 1
1 → [2,3 5]
use 2 as it is the minimum to generate next 3 numbers
2 → 4, 6, 10 which makes the list [3,4,5,6,10]
3 → 6, 9, 15 list →[3,4,5,6,9,10,15] and so on
 Now since we want to keep track of the minimum number we will use a heap to store the numbers
     */
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        minHeap.offer(1);
        set.add(1);

        Integer uglyNumber = 1;

        for (int i=1; i<=n; ++i) {
            uglyNumber = minHeap.poll();
            if (uglyNumber <= Integer.MAX_VALUE/2 && !set.contains(uglyNumber * 2)) {
                minHeap.offer(uglyNumber * 2);
                set.add(uglyNumber * 2);
            }
            if (uglyNumber <= Integer.MAX_VALUE/3 &&!set.contains(uglyNumber * 3)) {
                minHeap.offer(uglyNumber * 3);
                set.add(uglyNumber * 3);
            }
            if (uglyNumber <= Integer.MAX_VALUE/5 &&!set.contains(uglyNumber * 5)) {
                minHeap.offer(uglyNumber * 5);
                set.add(uglyNumber * 5);
            }
        }

        return uglyNumber.intValue();
    }
}
