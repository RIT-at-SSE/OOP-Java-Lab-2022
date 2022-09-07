package a.inheritance.solutions.solution1;

/**
 * A possible solution for the inheritance program.
 *
 * Here in the main, the classes A and B are used to demonstrate inheritance
 *
 * @author CSE - Noor Mohammed
 */
public class SimpleInheritance {

    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        // The superclass maybe used by itself.

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents ob superOb: ");
        superOb.showIJ();
        System.out.println(); // New line
        /* The subclass has access to all public members of its superclass. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Contents of subOb:");
        subOb.showIJ();
        subOb.showK();
        System.out.println();
        System.out.println("Sum of i, j, k in subOb:");
        subOb.sum();
    }
}
