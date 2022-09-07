package a.inheritance.template;

/**
 * A possible solution for the inheritance program.
 *
 * Here you have the superclass, use its attributes and methods in the subclass.
 * Notice there is a difference between the keywords protected and private.
 * Protected attributes can be accessed by subclasses directly, for private attributes you can use a method to access.
 *
 * @author INSO - Johannes Hufnagl
 */
class Animal {
    protected int weight = 25;
    private String name = "Lassie";

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public String getName() {
        return name;
    }
}