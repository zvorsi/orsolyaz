package GreatestValuesInMatrices;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestValuesInMatricesTest {

    @Test
    public void testgreatestValuesEmpty() {

        int[][] empty = new int[0][0];

        assertArrayEquals(empty, GreatestValuesInMatrices.greatestValues(empty, empty));
    }

    @Test
    public void testgreatestValuesOne() {

        int[][] matrix1 = {
                {1, 1},
                {0, 0}
        };

        int[][] matrix2 = {
                {0, 0},
                {1, 1}
        };

        int[][] matrix3 = {
                {1, 1},
                {1, 1}
        };


        assertArrayEquals(matrix3, GreatestValuesInMatrices.greatestValues(matrix1, matrix2));
    }


}