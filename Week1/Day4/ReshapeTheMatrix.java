package Week1.Day4;


public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 14 } };
        int r = 4, c = 3;
        int rlen = mat.length, clen = mat[0].length;
        if (r * c != rlen * clen) {
            for (int i = 0; i < rlen; i++) {
                for (int j = 0; j < clen; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }

        int[] arr = new int[rlen * clen];
        int[][] ans = new int[r][c];
        int k = 0;

        for (int i = 0; i < rlen; i++) {
            for (int j = 0; j < clen; j++) {
                arr[k++] = mat[i][j];
            }
        }
        k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = arr[k++];
            }
        }
        // printing ans
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
