import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixOperationTest {
    private static final int[][] TEST_MATRIX = {
            {-2, 31, 6, 7},
            {15, -42, 1, 0},
            {9, -7, 12, 19},
            {55, 34, 1, -10}
    };

    private static final int[][] SINGLE_ELEMENT_MATRIX = {
            {-5}
    };

    private static final int[] MATRIX_EXPECTED_DIAGONAL = {-2, -42, 12, -10};
    private static final int[] SINGLE_ELEMENT_EXPECTED_DIAGONAL = {-5};

    private static final int[] COUNTER_MATRIX_EXPECTED_DIAGONAL = {7, 1, -7, 55};
    private static final int[] COUNTER_SINGLE_ELEMENT_EXPECTED_DIAGONAL = {-5};

    @Test
    public void getMatrixDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getDiagonal(TEST_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(actualResult), MATRIX_EXPECTED_DIAGONAL, actualResult);
    }

    @Test
    public void getSingleElementMatrixDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getDiagonal(SINGLE_ELEMENT_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(actualResult), SINGLE_ELEMENT_EXPECTED_DIAGONAL, actualResult);
    }

    @Test
    public void getCounterMatrixDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getCounterDiagonal(TEST_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(actualResult), COUNTER_MATRIX_EXPECTED_DIAGONAL, actualResult);
    }

    @Test
    public void getCounterSingleElementMatrixDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getCounterDiagonal(SINGLE_ELEMENT_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                        + Arrays.toString(actualResult),
                COUNTER_SINGLE_ELEMENT_EXPECTED_DIAGONAL, actualResult);
    }

    @Test
    public void getMatrixMin() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMin(TEST_MATRIX);
        int expectedResult = Arrays.stream(TEST_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        Assert.assertEquals("Test failed with min result = "
                + actualResult, expectedResult, actualResult);
    }

    @Test
    public void getSingleElementMatrixMin() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMin(SINGLE_ELEMENT_MATRIX);
        int expectedResult = Arrays.stream(SINGLE_ELEMENT_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        Assert.assertEquals("Test failed with min result = "
                + actualResult, expectedResult, actualResult);
    }

    @Test
    public void getMatrixMax() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMax(TEST_MATRIX);
        int expectedResult = Arrays.stream(TEST_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        Assert.assertEquals("Test failed with max result = "
                + actualResult, expectedResult, actualResult);
    }

    @Test
    public void getSingleElementMatrixMax() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMax(SINGLE_ELEMENT_MATRIX);
        int expectedResult = Arrays.stream(SINGLE_ELEMENT_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        Assert.assertEquals("Test failed with max result = "
                + actualResult, expectedResult, actualResult);
    }
}
