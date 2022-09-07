package a.inheritance.solutions.solution1;

/**
 * A possible solution for the inheritance program.
 *
 * Class B inherits from his parent class A, therefore B is a subclass of A.
 *
 * @author CSE - Noor Mohammed
 */
public class B extends A {

    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
