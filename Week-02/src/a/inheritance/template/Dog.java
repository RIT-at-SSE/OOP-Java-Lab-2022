package a.inheritance.template;

/**
 * A possible solution for the inheritance program.
 *
 * Here you have the subclass dog, with additional attributes.
 *
 * @author INSO - Johannes Hufnagl
 */
public class Dog extends Animal {

    // Attributes of our dog
    // (keep in mind, that a dog is also an animal and therefore has also the attributes of an animal)
    private String owner;
    private String tricks;

    public Dog(int weight, int age, String name, String owner, String tricks) {
        // This line uses the constructor of the super class (Animal)
        super(weight, age, name);
        this.owner = owner;
        this.tricks = tricks;
    }

    // For each attribute we define getter and setter methods, to get an attribute or set one

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTricks() {
        return tricks;
    }

    public void setTricks(String tricks) {
        this.tricks = tricks;
    }

    // In this method our dog will learn a new trick
    public void learnNewTrick(String trick) {
        this.tricks = this.tricks + ", " + trick;
    }

    // The toString method defines how our dog will look like when it is printed to the console
    @Override
    public String toString() {
        return "Dog{" +
                " " + super.toString() + ", " +
                "owner='" + owner + '\'' +
                ", tricks='" + tricks + '\'' +
                '}';
    }
}
