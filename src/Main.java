import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;

        int[] mergedArray = new int[m + n];
        int i = 0;
        int j = 0;
        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j]){
                mergedArray[i + j] = nums1[i];
                i++;
            }
            else{
                mergedArray[i + j] = nums2[j];
                j++;
            }
        }
        while(i < m){
            mergedArray[i + j] = nums1[i];
            i++;
        }
        while(j < n){
            mergedArray[i + j] = nums2[j];
            j++;
        }
        nums1 = mergedArray;
        System.out.print("[");
        for(int k = 0; k < nums1.length - 1; k++){
            System.out.print(nums1[k] + ", ");
        }
        System.out.print(nums1[nums1.length - 1]);
        System.out.println("]");
    }

}