package Assignment_1;

import java.security.Principal;

public class UtilitiesAll {
    //Qs.6
    public static void calculateDBR(double expenses, double monthlyIncome){
        double result = expenses / monthlyIncome;
        double dbr = Round.roundOff(result);
        if (dbr <= 0.2) {
            System.out.println("Loan Approved");
        } else if (dbr > 0.4) {
            System.out.println("Loan Rejected");
        } else {
            System.out.println("DBR is between 20% and 40%. Further evaluation needed.");
        }
    }

    //Qs.7
    public static void calculateLTV(double loanAmount, double valueOfProperty){
        double result = (loanAmount / valueOfProperty);
        double ltv = Round.roundOff(result);

        if(ltv <= 0.8){
            System.out.println("Loan Approved");
        }
        else{
            System.out.println("Loan Rejected");
        }
    }

    //Qs.8
    public static double calculateMaxLoanEligibility(double effectiveMonthlySalary, double effectiveMonthlyRate, int tenure){

        double expenses = effectiveMonthlySalary * 0.2;
        double maxEligibleEMI = (effectiveMonthlySalary - expenses) * 0.5;
        effectiveMonthlyRate /= 12;
        double maxLoanAmount = maxEligibleEMI * ((Math.pow((1 + effectiveMonthlyRate), tenure) - 1) / (effectiveMonthlyRate * Math.pow((1 + effectiveMonthlyRate), tenure)));
        return maxLoanAmount;
    }

    //Qs.9
    public static double calculateInstallmentAmount(double loanAmount, double interestRate,int tenure, int installmentsPerYear){
        interestRate /= 100;
        double interestRatePerInstallment = interestRate /(double) installmentsPerYear;
        int totalInstallments = tenure * installmentsPerYear;
        double installmentAmount = (loanAmount * interestRatePerInstallment) / (1 - Math.pow((1 + interestRatePerInstallment), -totalInstallments));
        installmentAmount = Round.roundOff(installmentAmount);
        return installmentAmount;
    }

    //Qs.10
    public static void generateRepaymentSchedule(double loanAmount, double interestRate, int tenure, int installmentsPerYear){
        // double residualValue = 0;
        double interestRatePerInstallment = interestRate / installmentsPerYear;
        int totalInstallments = tenure * installmentsPerYear;
        double installmentAmount = (loanAmount * interestRatePerInstallment) / (1 - Math.pow((1 + interestRatePerInstallment), -totalInstallments));
        double outstandingPrincipal = loanAmount;
        System.out.println("Installment\tOpening Balance\t\t\tInterest\t\tPrincipal\t\tinstallmentAmount");
        for (int i = 1; i <= totalInstallments; i++) {
            double interest = outstandingPrincipal * interestRatePerInstallment;
            double principal = installmentAmount - interest;
            outstandingPrincipal -= principal;
            System.out.println(i + "\t\t" + outstandingPrincipal + "\t\t" + interest + "\t\t" + principal + "\t" + installmentAmount);
        }
    }

    //Qs.11
    // Principal and Interest Components have been calculated in Qs.10
}
