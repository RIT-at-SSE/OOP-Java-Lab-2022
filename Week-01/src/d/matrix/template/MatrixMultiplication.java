package d.matrix.template;

/**
 * A possible solution for the matrix multiplication program.
 *
 * The two matrices used for multiplication are initialized with fixed values.
 *
 * @author CSE - Noor Mohammed & INSO - Johannes Hufnagl
 */
public class MatrixMultiplication {
    public static void main(String args[]) {
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        // TODO create another matrix, in the same format as a
        int b[][] = {};

        // creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3];  //3 rows and 3 columns

        // multiplying and printing multiplication of 2 matrices
        // TODO: Figure out x
        //       how far does the loop have to go? (Hint: 0 is wrong, look at the size of the matrices)
        int x = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                c[i][j] = 0;
                for (int k = 0; k < x; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }//end of k loop
                System.out.print(c[i][j] + " "); // printing matrix element
            } // end of j loop
            System.out.println();//new line
        } // end of i loop
    }
}