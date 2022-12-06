package b.methods.template;

public class Cat extends Animal {

    private boolean tired;
    private boolean hungry;

    public Cat(int weight, int age, String name, boolean tired, boolean hungry) {
        super(weight, age, name);
        this.tired = tired;
        this.hungry = hungry;
    }

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean tired) {
        this.tired = tired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void feed() {
        this.hungry = false;
    }

    public void sleep(int hours) {
        if (hours > 2) {
            this.tired = false;
        } else {
            System.out.println("I feel still tired ...");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                " " + super.toString() + ", " +
                "tired=" + tired +
                ", hungry=" + hungry +
                '}';
    }
}
