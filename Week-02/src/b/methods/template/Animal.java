package b.methods.template;


/**
 * A possible solution for the inheritance program.
 *
 * Here you have the superclass, use its attributes and methods in the subclass.
 * Notice there is a difference between the keywords protected and private.
 * Protected attributes can be accessed by subclasses directly, for private attributes you can use a method to access.
 *
 * @author INSO - Johannes Hufnagl
 */
abstract class Animal {

    private int weight;
    private int age;
    private String name;

    public Animal(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method for overriding
    public void eat() {
        System.out.println("Animal is eating...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}