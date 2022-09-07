package a.installation.solutions.step3;

import a.installation.template.step3.DebuggingPrimeNumbers;

/**
 * Week 1 - A
 * Step 3 - Debugging
 *
 * The class {@link DebuggingPrimeNumbers} has a bug on line 37.
 * Ths class contains the solution to find all prime numbers between 0
 * and an upper boundary.
 *
 * See local README_Week01_A.md for an assignment description.
 *
 * @author RISE, INSO & SSE - Paul Spiesberger
 */
public class DebuggingPrimeNumbersSolution {

    public static void main(String[] args) {

        // Change to expand the search for prime numbers
        int searchUntil = 100;

        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= searchUntil; i++) {

            int counter = 0;

            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }

            if (counter == 2) { // 2 is 3 in the presentation file as the bug
                // Appended prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("Prime numbers from 1 to " + searchUntil + " are :");
        System.out.println(primeNumbers);
    }
}
