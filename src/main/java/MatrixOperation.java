import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][i];
        }

        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][matrix.length - i - 1];
        }

        return result;
    }

    public int getMin(int[][] matrix) {
        int result = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            int[] current = matrix[i];
            Arrays.sort(current);

            if (result > current[0]) {
                result = current[0];
            }
        }

        return result;
    }

    public int getMax(int[][] matrix) {
        int result = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            int[] current = matrix[i];
            Arrays.sort(current);

            if (result < current[current.length-1]) {
                result = current[current.length-1];
            }
        }

        return result;
    }
}
