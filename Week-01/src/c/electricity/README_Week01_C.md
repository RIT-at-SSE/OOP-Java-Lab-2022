# Week 1 - C

## Exercise Description
Develop a Java application to generate Electricity bills. 

Create a class with the following members: 
- Consumer no., 
- consumer name, 
- previous month reading, 
- current month reading, 
- type of EB connection (i.e domestic or commercial). 

Commute the bill amount using the following tariff.

If the type of the EB connection is domestic, calculate the amount to be paid as follows:
 - First 100 units - Rs. 1 per unit 
 - 101 - 200 units - Rs. 2.50 per unit 
 - 201 - 500 units - Rs. 4 per unit
 - more than 501 units - Rs. 6 per unit

If the type of the EB connection is commercial, calculate the amount to be paid as follows:
- First 100 units - Rs. 2 per unit 
- 101-200 units - Rs. 4.50 per unit 
- 201 -500 units - Rs. 6 per unit
- more than 501 units - Rs. 7 per unit

## Java Classes

Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

To create a class, use the keyword ``class``

### Objects 

In Java, an object is created from a class. We have already created the class named ``Main``, so now we can use this to create objects.

To create an object of ``Main``, specify the class name, followed by the object name, and use the keyword ``new``

## Further Reading

Here are some links to learn more about these topics:

- YouTube Video on Java Object Orientation: https://www.youtube.com/watch?v=j0lBrYSlYaU&ab_channel=AlexLee
- Java Classes: https://www.w3schools.com/java/java_classes.asp
- Java Class Methods: https://www.w3schools.com/java/java_class_methods.asp