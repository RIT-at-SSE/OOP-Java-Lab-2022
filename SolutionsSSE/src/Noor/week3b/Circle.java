package Noor.week3b;

/**
 * Rectangle extends from Shape and
 *
 * - Shape.value1 represents the radius
 * - Shape.value2 is not used
 *
 * <a href="https://www.pinterest.com/pin/621496817298570931/">Shape Cheatsheet</a>
 */
public class Circle extends Shape {

    @Override
    void printArea() {
        double area = Math.PI * value1 * value1;
        System.out.println("Area of Circle is: " + area);
    }
}
