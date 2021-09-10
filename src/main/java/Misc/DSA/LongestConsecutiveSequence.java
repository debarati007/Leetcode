package Misc.DSA;

import com.sun.deploy.util.OrderedHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    //brute force solution
    //for sorting complexity- O(nlogn)
    //for running a while loop inside a for loop time complexity> O(n) but less than O(n2)
    //hence total TC: O(nlogn)+O(n)
    //after sorting, trying to find a range of of consecutive numbers here using 2 pointers inside a while loop
    //space complexity is constant here

    //instead of using 2 loops,this could be optimed further by using some collection to store the range
    //we can achieve this in O(n) tc and O(n) space.
    public static int longestConsecutive(int[] num) {
        Arrays.sort(num);
        if (num.length == 1) {
            return 1;
        }
        int count = 0;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            int current_count = 1;
            int start = i;
            int end = i + 1;
            while (end < n) {
                if (num[start] + 1 == num[end]) {
                    ++current_count;
                    start = end;
                    end++;
                } else if (num[start] == num[end]) {
                    //continue for duplicate numbers such as [0,1,1,1,2] . Here count=3
                    start = end;
                    end++;
                } else {
                    break;
                }
            }
            count = Math.max(current_count, count);
            if (count == n - 1) {//optimising a little,if already count reaches length then no need to run loop further
                return count;
            }
        }
        System.out.println(count);
        return count;
    }

    //this is also O(nlogn)+O(n) complexity but slightly optimised without using while loop
    public static int longestConsecutiveBruteSecond(int[] num) {
        Arrays.sort(num);
        int n = num.length;
        if (n == 0) {
            return 0;
        }
        int count = 1;
        int current = 1;
        for (int i = 1; i < n; i++) {
            if (num[i] == num[i - 1]) continue;
            if (num[i] == num[i - 1] + 1) {
                current++;
            } else {
                count = Math.max(current, count);
                current = 1;
            }
        }
        count = Math.max(current, count);
        System.out.println(count);
        return count;
    }
//here taking a hashset and adding all elements int it
    //now checking if the previos digit exist in set for each number
    //only when there is no previus digit exits in set,we can say we got a number for which a sequence could be found
    //so starting a while loop,initialize the current count and keep running while loop till a steak is there for next element
    //after that comparing the current length with max
    //eg for 200,6,5,4,3,2,1-it after adding in set,it keeps checking if 199,5,,4,2,1 exists .Once it can't find 0,
    //it will start searching for next elemnt i.e 1,2,3,4,5,6 and keeps count in while loop.
    public static int longestConsecutiveOptimised(int[] num) {
        Set<Integer> set = new HashSet<>();
        int n = num.length;
        if (n == 0)
            return 0;
        for (int i = 0; i < n; i++) {
            set.add(num[i]);
        }
        int longestStreak = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(num[i] - 1)) {
                int cur = 1;
                int number = num[i];
                while (set.contains(number + 1)) {
                    cur++;
                    number++;
                }
                longestStreak = Math.max(cur, longestStreak);
            }
        }

        return longestStreak;

    }


    public static void main(String[] args) {
        longestConsecutiveOptimised(new int[]{0, 0, -1});
    }

}
