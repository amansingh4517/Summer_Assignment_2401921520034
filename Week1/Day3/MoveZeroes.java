package Week1.Day3;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int i = 0;

        for (int val : nums) {
            if (val != 0) nums[i++] = val;
        }
        while (i < nums.length) nums[i++] = 0;

        System.out.println(Arrays.toString(nums));
    }

}
