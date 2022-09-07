package a.installation.template.step3;

/**
 * Class to find all prime numbers between 0 and a upper boundary.
 * Change "searchUntil" to change the upper boundary.
 *
 * Prime number is a number that is divisible only by itself and 1.
 *
 * @author RISE, INSO & SSE - Paul Spiesberger
 */
public class DebuggingPrimeNumbers {

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

            if (counter == 3) {
                // Appended prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("Prime numbers from 1 to " + searchUntil + " are :");
        System.out.println(primeNumbers);
    }
}
