package Misc;
/*An n-bit gray code sequence is a sequence of 2n integers where:
        Every integer is in the inclusive range [0, 2^n - 1],
        The first integer is 0,
        An integer appears no more than once in the sequence,
        The binary representation of every pair of adjacent integers differs by exactly one bit, and
        The binary representation of the first and last integers differs by exactly one bit.
        Given an integer n, return any valid n-bit gray code sequence.
        Input: n = 2
Output: [0,1,3,2]

Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].

sol: Assume n=3.
add 0 and 1 as our inital start since n>=1:
000
001

In the Loop we create bit mask by shifting 1 to the ith bit int mask = 1 << i;.
Loop 1: mask = 010
Loop 2: mask = 100

Loop 1: Iterate backwards through list [000,001] and add the element to the array OR'd with the mask 010. This preserves the current 1's and adds a 1 at the new position. i.e.
000
001
011 (new add OR'd 001 with 010)
010 (new add OR'd 000 with 010)

Loop 2: Iterate backwards through list [000,001,011,010] and add the element to the array OR'd with the mask. 100
000
001
011
010
110 (new add OR'd 010 with 100)
111 (new add OR'd 011 with 100)
101 (new add OR'd 001 with 100)
100 (new add OR'd 000 with 100)

 */

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String args[]){
        grayCode(2);
    }
    private static void grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);

        for(int i=1;i<n;i++){
            int mask = 1<<i;
            for(int j=result.size()-1;j>=0;j--){
                result.add(result.get(j)|mask);
            }
        }
        System.out.print(result);
    }
}
