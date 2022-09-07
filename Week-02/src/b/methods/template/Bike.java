package b.methods.template;

/**
 * A template for a program with overriding and overloading.
 *
 * Bike is a subclass of Vehicle, (Therefore, Vehicle is a superclass of Bike).
 * Vehicle and Bike have the method run(), but when creating an instance of the subclass Bike the overwritten method us used
 * ALso Bike has an overloaded method of run, where an input parameter defines how fast the bike is going..
 *
 * @author CSE - Noor Mohammed INSO - Johannes Hufnagl
 */
class Vehicle {
    //defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Creating a child class
class Bike extends Vehicle {
    // TODO: define the same method as in the parent class


    // TODO: define an overloaded method with different input parameters


    public static void main(String args[]) {
        Bike obj = new Bike();//creating object
        obj.run();//calling method

        // TODO: Call the override method for the boy object

        // TODO: Call the overloaded method for the boy object

    }
}