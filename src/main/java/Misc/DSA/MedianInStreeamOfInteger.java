package Misc.DSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianInStreeamOfInteger {
/*
Source :
 1: https://leetcode.com/problems/find-median-from-data-stream/discuss/74047/JavaPython-two-heap-solution-O(log-n)-add-O(1)-find
 2: https://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
The root holds the effective median.
Now we can use a max heap on the left side to represent elements that are less than effective median, and a min-heap on the right side to represent elements that are greater than effective median.
After processing an incoming element, the number of elements in heaps differs utmost by 1 element. When both heaps contain the same number of elements, we pick the average of heaps root data as effective median. When the heaps are not balanced, we select effective median from the root of the heap containing more elements.
Given below is the implementation of the above method. For the algorithm to build these heaps, please read the highlighted code.
*/


        private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
        private PriorityQueue<Integer> large = new PriorityQueue<>();
        private boolean even = true;

        public MedianInStreeamOfInteger() {

        }

        public void addNum(int num) {
            if (even) {
                large.offer(num);
                small.offer(large.poll());
            } else {
                small.offer(num);
                large.offer(small.poll());
            }
            even = !even;
        }

        public double findMedian() {
            if (even)
                return (small.peek() + large.peek()) / 2.0;
            else
                return small.peek();
        }


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
