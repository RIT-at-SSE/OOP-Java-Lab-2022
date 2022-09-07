package Noor.week2b.overloading;

// Demonstrate method overloading.
public class OverloadDemo {

    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter and have a return value
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}