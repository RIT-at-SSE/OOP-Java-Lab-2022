package b.equation.template;

import java.util.Scanner;

/**
 * A template for the quadratic equation program.
 *
 * The variables a, b and c should be read in from the console, by using the Java.Scanner class.
 * Furthermore, you have to calculate the determinant and decide what happens if it is greater, equal or less than 0.
 *
 * @author CSE - Noor Mohammed & INSO - Johannes Hufnagl
 */
public class QuadraticEquation {

    public static void main(String[] args) {

        double root1, root2;

        // TODO: read in the values for a, b, and c via the Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a?");
        double a = scanner.nextDouble();
        // TODO: read in b the same way as a

        double b = 0; // change this line here

        // TODO: read in c the same way as a

        double c = 0; // change this line here

        // TODO: calculate the determinant (b2 - 4ac)
        double determinant = 0; // change this line here

        // TODO: check if determinant is greater than 0, by replacing 'false' with the correct statement
        if (false) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // TODO: check if determinant is equal to 0, by replacing 'false' with the correct statement
        else if (false) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if determinant is less than zero
        else {
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
