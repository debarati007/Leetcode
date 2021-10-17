package Misc.DSA;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        //if last digit is 9 then result array size will be n+1
        //for 9- 1st digit will be 1 and rest are 0
        //for other only last digit will increasr+1
        int result[];
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }

        if(digits[0] == 0){
            result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        return digits;

    }
}
