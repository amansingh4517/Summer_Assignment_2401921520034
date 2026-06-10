package Week1.Day2;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        int sum = 0 , maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < k ; i++){
            sum+=nums[i];
        }
        maxSum = Math.max(maxSum , sum);
        int i = k ;
        while(i<nums.length){
            sum += (nums[i] - nums[i-k]);
            maxSum = Math.max(maxSum , sum);
            i++;
        }
        System.out.println((double) maxSum/k);
    }
}
