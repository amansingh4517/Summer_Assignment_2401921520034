package Week1.Day3;

import java.util.Arrays;

public class SquaresOfaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int i = 0 , j = nums.length - 1 , k = j;
        int[] ans = new int[j+1];
        
        while(i<=j){
            if(nums[i]*nums[i] > nums[j]*nums[j]) ans[k--] = nums[i]*nums[i++];
            else ans[k--] = nums[j]*nums[j--];
        }

        System.out.println(Arrays.toString(ans));
    }
}
