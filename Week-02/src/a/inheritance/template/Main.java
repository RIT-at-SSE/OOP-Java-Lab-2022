package a.inheritance.template;

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

        // TODO: Create a new instance of a Cat


        // TODO: Print out all information about your Cat (weight, name, ...)


    }
}
