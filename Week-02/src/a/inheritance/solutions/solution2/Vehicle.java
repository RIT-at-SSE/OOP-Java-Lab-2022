package a.inheritance.solutions.solution2;

/**
 * A possible solution for the inheritance program.
 *
 * This is an example from w3schools, Car is a subclass of Vehicle
 * (Therefore, Vehicle is a superclass of Car).
 * Vehicle has the method honk() which can be used in all of its subclasses as well.
 *
 * @author INSO - Johannes Hufnagl
 * @see <a href="https://www.w3schools.com/java/java_inheritance.asp">W3schools Jav Inheritance</a>
 */
class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}