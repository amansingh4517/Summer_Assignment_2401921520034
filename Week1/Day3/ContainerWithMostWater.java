package Week1.Day3;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = 0 , j = height.length - 1 , maxArea = 0;;

        while(i<j){
            int area = (j-i) * Math.min(height[j] , height[i]);
            maxArea = Math.max(maxArea , area);
            if(height[i]<height[j]) i++;
            else j--;
        }
        
        System.out.println(maxArea);
    }
}
