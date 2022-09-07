# Week 2 - B

## Exercise Description

Write Java program on dynamic binding, differentiating method overloading and overriding.

## Method Overriding

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding
- Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
- Method overriding is used for runtime polymorphism

Rules for Java Method Overriding
1. The method must have the same name as in the parent class
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship (inheritance).

## Method Overloading
With method overloading, multiple methods can have the same name with different parameters:

````java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
````

Consider the following example, which has two methods that add numbers of different type:

````java
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
````

Instead of defining two methods that should do the same thing, it is better to overload one.

In the example below, we overload the plusMethod method to work for both int and double:

````java
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
````

## Further Reading

Here are some links to learn more about these topics:

- YouTube Video on Overloading vs Overriding: https://www.youtube.com/watch?v=ryDeTfmSY_o&ab_channel=Smartherd
- Java Overriding: https://www.javatpoint.com/method-overriding-in-java
- Java Overloading: https://www.w3schools.com/java/java_methods_overloading.asp