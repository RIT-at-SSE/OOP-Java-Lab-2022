package Noor.week2b.overloading;

public class Overload {

    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // Call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
