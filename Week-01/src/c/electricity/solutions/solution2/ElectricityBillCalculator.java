package c.electricity.solutions.solution2;

/**
 * In this ElectricityBillCalculator class, a constructor takes in the provided electricity bill.
 *
 * In the method calculateAmount() the total kilowatts are calculated, based on the arguments in the bill.
 * The result is then returned.
 *
 * @author CSE, INSO & SSE - Raimund Rittnauer
 */
public class ElectricityBillCalculator {
    private ElectricityBill electricityBill;

    public ElectricityBillCalculator(ElectricityBill electricityBill) {
        this.electricityBill = electricityBill;
    }

    public double calculateAmount() {
        int totalKiloWattHours = electricityBill.getTotalKiloWattHours();

        if (electricityBill.getConnection() == "domestic") {
            if (totalKiloWattHours <= 100) {
                return totalKiloWattHours * 1;
            } else if (totalKiloWattHours > 100 && totalKiloWattHours <= 200) {
                return totalKiloWattHours * 2.5;
            } else if (totalKiloWattHours > 200 && totalKiloWattHours <= 500) {
                return totalKiloWattHours * 4;
            } else if (totalKiloWattHours > 500) {
                return totalKiloWattHours * 6;
            }
        } else if (electricityBill.getConnection() == "commercial") {
            if (totalKiloWattHours <= 100) {
                return totalKiloWattHours * 2;
            } else if (totalKiloWattHours > 100 && totalKiloWattHours <= 200) {
                return totalKiloWattHours * 4.5;
            } else if (totalKiloWattHours > 200 && totalKiloWattHours <= 500) {
                return totalKiloWattHours * 6;
            } else if (totalKiloWattHours > 500) {
                return totalKiloWattHours * 7;
            }
        }

        return 0;
    }
}
