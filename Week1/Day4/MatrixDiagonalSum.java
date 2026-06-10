package Week1.Day4;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(i==j || i+j==mat[0].length-1) sum += mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
