/*
    LGS: Datatyp für linearegleichsystem
    Ax = b
 */

public class LGS {
    double[][] matrix;
    double[] vector;
    int matrixLength; // num of rows
    int matrixWidth; // num of col
    int vectorSize;

    // matrix = Arrays.stream(originalMatrix).map(r -> r.clone()).toArray(double[][]::new);


    public LGS (double[][] mat, double[] vec) {
        matrix = mat;
        vector = vec;

        vectorSize = vector.length;
        matrixLength = matrix.length; // num of rows
        matrixWidth = matrix[0].length; // num of col

    }

    // Zeilen tauschen a <--> b
    public void swapRows(int a, int b) {
        double[] tempRow = matrix[a];
        matrix[a] = matrix[b];
        matrix[b] = tempRow;
    }

    // get pivot row for given col
    public int getPivotRow(int col) {

        int pivotRow = 0;

        for(int i = 0; i < matrixLength; i++) {
            if (this.matrix[i][col] > this.matrix[pivotRow][col]) {
                pivotRow = i;
            }
        }

        return pivotRow;
    }

    public void print() {
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
