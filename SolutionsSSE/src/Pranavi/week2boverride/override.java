package Pranavi.week2boverride;

class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class override extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        override obj = new override();//creating object
        obj.run();//calling method
    }
}