import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class LgsTests {

    public static LGS lgs;

    //before

    @BeforeAll
    static void setup(){
/*
        double[][] matrix = new double[][]{{1, 4},{3, 2}};
        double[] vector = {1, 2};

        lgs = new LGS(matrix, vector);*/
    }

    //Actual test methods

    @Test
    public void getPivotRowTest(){

        double[][] matrix = new double[][]{{1, 4},{3, 2}};
        double[] vector = {1, 2};

        lgs = new LGS(matrix, vector);

        int result = lgs.getPivotRow(0);
        Assertions.assertEquals(1,result);

        result = lgs.getPivotRow(1);
        Assertions.assertEquals(0,result);

        lgs.print();
    }

    @Test
    public void swapRowsTest() {
        double[][] matrix = new double[][]{{1, 4},{3, 2}};
        double[] vector = {1, 2};

        lgs = new LGS(matrix, vector);

        lgs.print();

        lgs.swapRows(0, 1);

        double[][] expMatrix = new double[][]{{3, 2}, {1, 4}};

        Assertions.assertArrayEquals(expMatrix[0], matrix[0]);
        Assertions.assertArrayEquals(expMatrix[1], matrix[1]);


        lgs.print();
    }


    //after

    @AfterAll
    static void finish(){

        lgs.print();
        System.out.println("Tests are finished!");

    }
}
