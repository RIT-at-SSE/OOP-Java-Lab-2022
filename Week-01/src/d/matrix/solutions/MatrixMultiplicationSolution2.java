package d.matrix.solutions;

/**
 * In this code there is a quick introduction on how to multiply matrices.
 *
 * This class provides different solution to multiply matrices, by using different methods.
 *
 * In the method simpleMultiplication(), the calculation is done manually for each index.
 *
 * In the method doubleLoopMultiplication(), there is a nested loop, which makes the calculation easier,
 * by using the formula only once with the help of the changing loop variables, but notice, that the sum of the
 * multiplications still has to be calculated every run through.
 *
 * In the last method tripleLoopMultiplication(), there is another nested loop, which helps with building the sum
 * of the multiplication, now the calculation is very simple, this is because the logic now is in the way the
 * loops are nested.
 *
 * @author CSE, INSO & SSE - Lukas Buerstmayr
 */
public class MatrixMultiplicationSolution2 {

    /*
    Brief introduction to matrix multiplication:
    In order to be able to multiply two matrices A and B,
    the number of columns of A must be equal to the number of rows of B and
    The number of rows of the resulting matrix C is equal to the number of rows of A and
    the number of columns of C is equal to the number of columns of B
    Example: 2x3 Matrix * 3x2 Matrix => 2x2 Matrix
    If A is:
    |   a1,1   a1,2   a1,3   |
    |   a2,1   a2,2   a2,3   |
    B is:
    |   b1,1   b2,1   |
    |   b2,1   b2,2   |
    |   b3,1   b3,2   |
    C is:
    |   c1,1   c1,2   |
    |   c2,1   c2,3   |
    Then:
    c1,1 = a1,1 * b1,1 + a1,2 * b2,1 + a1,3 * b3,1
    c1,2 = a1,1 * b1,2 + a1,2 * b2,2 + a1,3 * b3,2
    c2,1 = a2,1 * b1,1 + a2,2 * b2,1 + a2,3 * b3,1
    c2,2 = a2,1 * b1,2 + a2,2 * b2,2 + a2,3 * b3,2

    In this example Matrix A is defined as:
    |   2   5   1   |
    |   1   7   0   |
    and B is defined as:
    |   4   3   |
    |   6   2   |
    |   2   8   |
    Now calculate the product of A * B with Java, have fun! :)
     */
    private static final int[][] matrixA = {
            {2, 5, 1},
            {1, 7, 0}
    };

    private static final int[][] matrixB = {
            {4, 3},
            {6, 2},
            {2, 8}
    };

    public static void main(String[] args) {
        int[][] simpleC = simpleMultiplication();
        int[][] doubleLoopC = doubleLoopMultiplication();
        int[][] tripleLoopC = tripleLoopMultiplication();

        int[][][] resultArray = {
                simpleC,
                doubleLoopC,
                tripleLoopC,
        };

        for (int i = 0; i < 3; i++) {
            System.out.println("__________");
            for (int j = 0; j < 2; j++) {
                System.out.println("| " + resultArray[i][j][0] + " " + resultArray[i][j][1] + "  |");
            }
            System.out.println("----------");
        }
    }

    private static int[][] simpleMultiplication() {

        int c1_1 = matrixA[0][0] * matrixB[0][0] +
                matrixA[0][1] * matrixB[1][0] +
                matrixA[0][2] * matrixB[2][0];

        int c1_2 = matrixA[0][0] * matrixB[0][1] +
                matrixA[0][1] * matrixB[1][1] +
                matrixA[0][2] * matrixB[2][1];

        int c2_1 = matrixA[1][0] * matrixB[0][0] +
                matrixA[1][1] * matrixB[1][0] +
                matrixA[1][2] * matrixB[2][0];

        int c2_2 = matrixA[1][0] * matrixB[0][1] +
                matrixA[1][1] * matrixB[1][1] +
                matrixA[1][2] * matrixB[2][1];

        return new int[][]{
                {c1_1, c1_2},
                {c2_1, c2_2}
        };
    }

    private static int[][] doubleLoopMultiplication() {

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][0] * matrixB[0][j] +
                        matrixA[i][1] * matrixB[1][j] +
                        matrixA[i][2] * matrixB[2][j];
            }
        }

        return result;
    }

    private static int[][] tripleLoopMultiplication() {

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sumOfC = 0;
                for (int k = 0; k < 3; k++) {
                    sumOfC += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sumOfC;
            }
        }

        return result;
    }
}
