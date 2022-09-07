package Noor.week3b;

/**
 * Rectangle extends from Shape and
 *
 * - Shape.value1 represents the height
 * - Shape.value2 represents the width
 *
 * <a href="https://www.pinterest.com/pin/621496817298570931/">Shape Cheatsheet</a>
 */
public class Rectangle extends Shape {

    @Override
    void printArea() {
        int area = value1 * value2;
        System.out.println("Area of Rectangle is: " + area);
    }
}
