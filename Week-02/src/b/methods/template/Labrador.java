package b.methods.template;

public final class Labrador extends Dog {

    private String color;

    public Labrador(int weight, int age, String name, String owner, String tricks, String color) {
        super(weight, age, name, owner, tricks);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method for overriding
    public void eat() {
        System.out.println("Labrador is eating...");
    }

    @Override
    public String toString() {
        return "Labrador{" +
                " " + super.toString() + ", " +
                "color='" + color + '\'' +
                '}';
    }
}
