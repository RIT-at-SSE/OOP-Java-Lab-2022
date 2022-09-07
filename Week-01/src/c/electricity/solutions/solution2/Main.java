package c.electricity.solutions.solution2;

/**
 * In this Main class comes all together, the other two classes are used to first store the information, by creating
 * a new instance of ElectricityBill and using the setters (e.g. setConsumerId(1)).
 * After that, this bill is given to the ElectricityBillCalculator class which then performs the calculations.
 * Last but not least, the getters of the ElectricityBill class (e. g. getTotalKiloWattHours()) are used to display
 * the calculated bill.
 *
 * @author RISE, INSO & SSE - Raimund Rittnauer
 */
public class Main {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.setConsumerId(1);
        bill.setConsumerName("Consumer 1");
        bill.setKiloWattHoursOfPreviousMonth(50);
        bill.setKiloWattHoursOfCurrentMonth(50);
        bill.setConnection("domestic");

        ElectricityBillCalculator calculator = new ElectricityBillCalculator(bill);

        System.out.printf("Electricity Bill for %s (%d)", bill.getConsumerName(), bill.getConsumerId());
        System.out.println();
        System.out.printf("Connection type: %s", bill.getConnection());
        System.out.println();
        System.out.printf("Previous month (kWH): %d", bill.getKiloWattHoursOfPreviousMonth());
        System.out.println();
        System.out.printf("Current month (kWH): %d", bill.getKiloWattHoursOfCurrentMonth());
        System.out.println();
        System.out.printf("Total (kWH): %d", bill.getTotalKiloWattHours());
        System.out.println();
        System.out.println();
        System.out.printf("Amount (Rs.): %.2f", calculator.calculateAmount());
    }
}
