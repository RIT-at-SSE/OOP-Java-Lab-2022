package Pranavi.week3b;

import java.io.*;
// Using abstract methods and classes.
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    // area is now an abstract method
    abstract double area();
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
class abstractarea {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter leght and breadth of Rectangle");
        double len=Double.parseDouble(br.readLine());
        double bdt=Double.parseDouble(br.readLine());
        System.out.println("Enter height and side of Triangle");
        double ht=Double.parseDouble(br.readLine());
        double sd=Double.parseDouble(br.readLine());
        Rectangle r = new Rectangle(len, bdt);
        Triangle t = new Triangle(ht, sd);
        Figure figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}