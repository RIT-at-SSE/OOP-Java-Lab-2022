package c.electricity.solutions.solution2;

/**
 * ElectricityBill is a class representing all parts of the bill.
 * It has all necessary variables needed to calculate the total and provide the customer information.
 * This class will be used in the other classes (Main and ElectricityBillCalculator) to get the billing information.
 *
 * @author RISE, INSO & SSE - Raimund Rittnauer
 */
public class ElectricityBill {
    private int consumerId;
    private String consumerName;
    private int kiloWattHoursOfPreviousMonth;
    private int kiloWattHoursOfCurrentMonth;
    private String connection;

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public int getKiloWattHoursOfPreviousMonth() {
        return kiloWattHoursOfPreviousMonth;
    }

    public void setKiloWattHoursOfPreviousMonth(int kiloWattHoursOfPreviousMonth) {
        this.kiloWattHoursOfPreviousMonth = kiloWattHoursOfPreviousMonth;
    }

    public int getKiloWattHoursOfCurrentMonth() {
        return kiloWattHoursOfCurrentMonth;
    }

    public void setKiloWattHoursOfCurrentMonth(int kiloWattHoursOfCurrentMonth) {
        this.kiloWattHoursOfCurrentMonth = kiloWattHoursOfCurrentMonth;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public int getTotalKiloWattHours() {
        return kiloWattHoursOfPreviousMonth + kiloWattHoursOfCurrentMonth;
    }
}
