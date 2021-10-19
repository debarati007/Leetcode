package Misc.DSA;
/**
 * Forward declaration of guess API.
 * @param  // num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */
public class GuessNumber {
    static int max = 10;
    static int min = 1;
    static int range = max - min + 1;
    static int pick = (int)(Math.random() * range) + min;
    public static void main(String[] args) {
        System.out.println(guessNumber(45));
    }
    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
    static int guess(int num){
        System.out.println("guess:"+pick);
        if(pick < num)
            return -1;
        if(pick > num)
            return 1;
        else return 0;
    }
}
