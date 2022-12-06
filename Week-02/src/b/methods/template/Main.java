package b.methods.template;

public class Main {

    public static void main(String[] args) {

        // A new instance of Dog
        Dog bello = new Dog(10, 2, "Bello", "Johannes", "Sit, Give Paw");

        // Print out information about our dog Bello
        System.out.println(bello);

        // Create a friend for Bello
        Dog daisy = new Dog(8, 3, "Daisy", "Paul", "Play Dead, Beg, Give Paw");

        // Print out information about our dog Daisy
        System.out.println(daisy);

        // Learn Bello a new trick called "Spin"
        bello.learnNewTrick("Spin");

        // Lets see which tricks Bello can do now
        System.out.println(bello.getTricks());

        // Now we will add a Labrador
        Labrador buddy = new Labrador(14, 3, "Buddy", "Raimund", "", "brown");

        Cat garfield = new Cat(10, 8, "Garfield", false, true);

        System.out.println(garfield);


        // New things:

        // Dynamic binding:
        // (now Animal is not abstract anymore)

        Animal max = new Dog(9, 2, "Max", "CSE Department", "Sit, Give Paw");

        checkType(max);

        checkType(buddy);

        checkType(garfield);


        // Method overriding
        max.eat();
        buddy.eat();

        // Method overloading
        bello.eat("a bone");
        buddy.eat("meat");
    }

    public static void checkType(Animal input) {
        if (input instanceof Labrador) {
            System.out.println("I am an Animal -> Dog -> Labrador");
        } else if (input instanceof Dog) {
            System.out.println("I am an Animal -> Dog");
        } else if (input instanceof Cat) {
            System.out.println("I am an Animal -> Cat");
        } else {
            System.out.println("I am an Animal");
        }
    }
}
