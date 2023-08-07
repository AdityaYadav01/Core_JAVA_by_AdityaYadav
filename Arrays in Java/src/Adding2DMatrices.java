// Adding 2D matrices

import java.util.Arrays;

public class Adding2DMatrices {
    public static void main(String[] args) {
        int [][]a = {{3,7,9},{7,6,2},{1,2,3}};
        int [][]b = {{3,7,9},{7,6,2},{1,2,3}};

        int [][]sum = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }

        }
        System.out.println(Arrays.deepToString(sum) + " ");
    }
}
