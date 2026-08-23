public class MatrixOperation {

    static int[] rowSums(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j];
            }
        }

        return result;
    }

    static int[] columnSums(int[][] matrix) {
        int[] result = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j] += matrix[i][j];
            }
        }

        return result;
    }

    static int[][] add(int[][] firstmatrix, int[][] secondmatrix) {
        int[][] result = new int[firstmatrix.length][firstmatrix[0].length];

        for (int i = 0; i < firstmatrix.length; i++) {
            for (int j = 0; j < firstmatrix[i].length; j++) {
                result[i][j] += firstmatrix[i][j] + secondmatrix[i][j];
            }
        }

        return result;
    }
    static int[][] transpose(int[][] matrix){
        int[][] result=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
    static int[][] multiply(int[][] firstmatrix, int[][] secondmatrix){
        int[][]result=new int[firstmatrix.length][secondmatrix[0].length];
            for(int i=0;i<firstmatrix.length;i++){
                for(int j=0;j<secondmatrix[i].length;j++){
                    for(int k=0;k<secondmatrix.length;k++){
                        result[i][j]+=firstmatrix[i][k]*secondmatrix[k][j];

                    }
                }
            }
            return result;
        }
    static void printMatrix(int[][] matrix) {
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        }
    }
 }
