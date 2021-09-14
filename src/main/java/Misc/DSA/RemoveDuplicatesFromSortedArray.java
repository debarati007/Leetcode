package Misc.DSA;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
//using 2 pointers
    //iterate the array using j pointer
    //i pointer only moves ahead if j pointer come across no duplicate element
    //once j pointer finds an unique element,we move it next to where i pointer is pointing,
    //so after iteration complete it looks like [0,1,2,3,4,0,1,1,2,3]
    //i pointer at 4 and j at array end.
    //but we return only the i pointer that is the count of unique element

    private static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
