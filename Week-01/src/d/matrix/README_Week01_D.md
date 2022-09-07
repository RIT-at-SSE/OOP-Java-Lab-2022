# Week 1 - D

## Exercise Description

Write a Java program to multiply two given matrices.

## Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with **square brackets**:

`String[] cars;`

We have now declared a variable that holds an array of strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:

`String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};`

To create an array of integers, you could write:

`int[] myNum = {10, 20, 30, 40};`

## Access the Elements of an Array
You access an array element by referring to the index number.

This statement accesses the value of the first element in cars:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```

## For Loop

Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

**Syntax**
```java
for (statement 1; statement 2; statement 3) {
// code block to be executed
}
```
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:

````java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
````
## Further Reading

Here are some links to learn more about these topics:

- YouTube Video on Java For Loop: https://www.youtube.com/watch?v=rjkYAs6gAkk&ab_channel=thenewboston
- YouTube Video on Two-Dimensional Arrays: https://www.youtube.com/watch?v=Gbz3Ao2xq_4&ab_channel=NesoAcademy
- Java Arrays: https://www.w3schools.com/java/java_arrays.asp
- Java For Loop: https://www.w3schools.com/java/java_for_loop.asp
- Matrix multiplication: https://www.mathsisfun.com/algebra/matrix-multiplying.html