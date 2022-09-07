package Noor.week3b;

/**
 * Triangle extends from Shape and
 *
 * - Shape.value1 represents the hypotenuse
 * - Shape.value2 represents the height (h) of the triangle
 *
 * <a href="https://www.pinterest.com/pin/621496817298570931/">Shape Cheatsheet</a>
 */
public class Triangle extends Shape {

    @Override
    void printArea() {
        double area = 0.5 * value1 * value2;
        System.out.println("Area of Triangle is: " + area);
    }
}
