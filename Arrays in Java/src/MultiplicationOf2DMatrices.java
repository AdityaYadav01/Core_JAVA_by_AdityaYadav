// Multiplication of 2D Matrices

public class MultiplicationOf2DMatrices {
    public static void main(String[] args) {
        int [][]a = {{3,7,9},{7,6,2},{1,2,3}};
        int [][]b = {{1,0,0},{0,1,0},{0,0,1}};

        int [][]mul = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mul[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
                }
            }
        }

        for (int[] x :mul) {
            for (int y:x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
