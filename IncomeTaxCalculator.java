package Assignment_1;

public class IncomeTaxCalculator {
    public static double calculateTax(double taxableIncome){

        double taxPayable = 0;

        if (taxableIncome <= 20000) {
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {
            taxPayable = (taxableIncome - 20000) * 0.1;
        } else if (taxableIncome <= 60000) {
            taxPayable = 20000 * 0.1 + (taxableIncome - 40000) * 0.2;
        } else {
            taxPayable = 20000 * 0.1 + 20000 * 0.2 + (taxableIncome - 60000) * 0.3;
        }
        return taxPayable;
    }
}
