package b.equation.solutions;

import java.util.Scanner;

/**
 * A possible solution for the quadratic equation program.
 *
 * The variables a, b and c are read in from the console, by using the Java.Scanner class.
 *
 * @author CSE - Bhargavi
 */
public class QuadraticEquationSolution2 {

    public static void main(String args[]) {

        double secondRoot = 0, firstRoot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b ::");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c ::");
        double c = sc.nextDouble();
        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
        } else { // If roots are not real
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("Roots are:: %.2f+%.2fi and  %.2f-%.2fi", realPart, imaginaryPart, realPart,
                    imaginaryPart);
        }
    }
}

