import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] numsOneTwo = new int[]{1, 3, 7};
        int[] numsThreeFourFive = new int[]{1, 3, 5, 7};
        int[] numsSix = new int[]{1, 4};
        int[] empty = new int[]{};
        int[] numsEleven = new int[]{1, 2, 4, 6, 7};
        System.out.println("Case one: " + (searchInsert(numsOneTwo, 2) == 1));
        System.out.println("Case two: " + (searchInsert(numsOneTwo, 5) == 2));
        System.out.println("Case three: " + (searchInsert(numsThreeFourFive, 2) == 1));
        System.out.println("Case four: " + (searchInsert(numsThreeFourFive, 4) == 2));
        System.out.println("Case five: " + (searchInsert(numsThreeFourFive, 6) == 3));
        System.out.println("Case six: " + (searchInsert(numsSix, 3) == 1));
        System.out.println("Case seven: " + (searchInsert(numsThreeFourFive, 1) == 0));
        System.out.println("Case eight: " + (searchInsert(numsThreeFourFive, 7) == 3));
        System.out.println("Case nine: " + (searchInsert(empty, 2) == 0));
        System.out.println("Case ten: " + (searchInsert(numsThreeFourFive, 5) == 2));
        System.out.println("Case eleven: " + (searchInsert(numsEleven, 3) == 2));

    }
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums[0] >= target) {
            return 0;
        } else if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        else if(nums[nums.length - 1] == target){
            return nums.length - 1;
        }
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return -1;
    }
}