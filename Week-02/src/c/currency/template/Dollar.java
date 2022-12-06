package c.currency.template;

public class Dollar implements ICurrency {

    private double amount;

    public Dollar(Integer amount) {
        this.amount = amount;
    }

    @Override
    public void toRupee() {
        double inr = amount * 67;
        System.out.println("Dollar = " + amount + " equal to INR = " + inr);
    }

    @Override
    public void toDollar() {
        System.out.println("Dollar = " + amount + " equal to USD = " + amount); // no conversation needed
    }

    @Override
    public void toEuro() {
        double euro = amount * 0.95;
        System.out.println("Dollar = " + amount + " equal to EUR = " + euro);
    }

    @Override
    public void toYen() {
        double yen = amount * 136;
        System.out.println("Dollar = " + amount + " equal to YEN = " + yen);
    }
}
