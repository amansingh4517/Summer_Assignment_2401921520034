//LEETCODE 643 : Maximum Average Subarray I
package Week1.Day2;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            maxSum = Math.max(sum , maxSum);
            if(sum<0) sum = 0;
        }
        System.out.println(maxSum);


    }
}
