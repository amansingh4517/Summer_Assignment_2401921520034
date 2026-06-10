package Week1.Day4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        List<Integer> list = new ArrayList<>();
        int top = 0 , bottom  = matrix.length-1 , left = 0  , right = matrix[0].length-1;
        int i = 0 , j = 0;
        while(top<=bottom && left<=right){
            //left to right 
            while(top<=bottom && left<=right && j<=right){
                list.add(matrix[i][j++]);
            }
            top++;
            j--;
            i = top;


            //top to bottom
            while(top<=bottom && left<=right && i<=bottom){
                list.add(matrix[i++][j]);
            }
            right--;
            i--;
            j = right;

            //right to left 
            while(top<=bottom && left<=right && j>=left){
                list.add(matrix[i][j--]);
            }
            bottom--;
            j++;
            i = bottom;

            //bottom to top
            while(top<=bottom && left<=right && i>=top){
                list.add(matrix[i--][j]);
            }
            left++;
            i++;
            j = left;

            // TIP : use for loop 
            // for(int i = left;i<=right;i++) res.add(matrix[top][i]);
            // top++;
        }
        System.out.println(list);
    }
}
