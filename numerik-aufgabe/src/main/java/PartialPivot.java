import java.util.Arrays;

public class PartialPivot {

    double[] xValues;



    public double[] solveLgs (LGS lgs) {

        int col = 1;
        int row = 1;



        while (row < lgs.matrix[col].length) {

        }


        return xValues;
    }

    private void createValuesArray(int numOfRows) {
        xValues = new double[numOfRows];
        for (int i = 0; i < numOfRows; i++) {
            xValues[i] = 0;
        }
    }
}
