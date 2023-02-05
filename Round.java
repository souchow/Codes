package Assignment_1;

public class Round{
    public static double roundOff(double amount){
        return Double.parseDouble(String.format("%.2f", amount));
    }
}
