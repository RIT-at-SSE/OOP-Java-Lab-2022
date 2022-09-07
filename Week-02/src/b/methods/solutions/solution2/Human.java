package b.methods.solutions.solution2;

/**
 * A possible solution for the overriding program.
 *
 * This is an example from Beginnersbook, Boy is a subclass of Human
 * (Therefore, Human is a superclass of Boy).
 * Human and Boy have the method eat(), but when creating an instance of the subclass boy the overwritten method us used
 * ALso Boy has an overloaded method eat, where an input String defines what the boy is eating.
 *
 * @author INSO - Johannes Hufnagl
 * @see <a href="https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/">Beginnersbook</a>
 */
class Human{
    //Overridden method
    public void eat()
    {
        System.out.println("Human is eating");
    }
}
class Boy extends Human{
    //Overriding method
    public void eat(){
        System.out.println("Boy is eating");
    }

    //Overriding method
    public void eat(String food){
        System.out.println("Boy is eating " + food);
    }

    public static void main( String args[]) {
        Boy obj = new Boy();
        //This will call the child class version of eat()
        obj.eat();
        obj.eat("Apples");
    }
}