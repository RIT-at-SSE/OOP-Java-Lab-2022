package b.equation.solutions;

import java.util.Scanner;

/**
 * A possible solution for the quadratic equation program.
 *
 * The variables a, b and c are read in from the console, by using the Java.Scanner class.
 *
 * @author CSE - Peddakotla Meghana
 */
public class QuadraticEquationSolution3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a?");
        double a = scanner.nextInt();
        System.out.println("Value of b?");
        double b = scanner.nextInt();
        System.out.println("Value of c?");
        double c = scanner.nextInt();
        printRootsOfQuadraticEquation(a, b, c);
    }

    private static void printRootsOfQuadraticEquation(double a, double b, double c) {

        System.out.println("Inputs a : " + a + ", b : " + b + ", c : " + c);
        double determinant = b * b - 4 * a * c;
        double root1;
        double root2;

        if (determinant > 0) { // condition check for real and different roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);

        } else if (determinant == 0) { // Condition check for real and equal roots
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);

        } else { // If roots are not real
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
                    imaginaryPart);
        }
        System.out.println("\n");
    }
}
