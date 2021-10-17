package Misc.DSA;

import java.util.PriorityQueue;

public class kthSmallestInMatrix {
    /*
    Simple Rule : To find kth min element use Max Heap ; to find kth max Element use Min Heap
    Imagine MaxHeap as a stack with highest element at top always, so whenever we insert any element Heapify happens and puts the highest element at top(as per Max Heap ).
    So when we keep on iterating each rows, we insert element, and Heapify happens automatically for the numbers present in heap, making the highest element among them to top.
    On checking (maxheap.size() > k) whenever we put more elements than k times, we remove the top largest element of heap; keeping only the kth smallest at top.
    TC:klogM
    */
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,4,9},{5,6,10},{7,8,12}};
        System.out.println(kthSmallest(matrix,2));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0)
            return -1;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> (b - a));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxheap.offer(matrix[i][j]);
                if (maxheap.size() > k) {
                    maxheap.poll();
                }
            }
        }
        return maxheap.peek();
    }
}
