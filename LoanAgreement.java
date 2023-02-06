package assignment2;

import assignment1.UtilitiesAll;

import java.util.Date;

public class LoanAgreement {
    private int loanAgreementId;
    private LoanProduct loanProduct;
    private double loanAmount;
    private int tenure;
    private double roi;
    private enum loanStatus{
        APPROVED,
        REJECTED,
        OPEN,
        CLOSED
    };
    private double emiPerMonth;
    private Date loanDisbursalDate;
    private int repaymentFrequency;

    private double valueOfProperty;

    //Getter-Setter

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getValueOfProperty() {
        return valueOfProperty;
    }

    public void setValueOfProperty(double valueOfProperty) {
        this.valueOfProperty = valueOfProperty;
    }

    public int getLoanAgreementId() {
        return loanAgreementId;
    }

    public void setLoanAgreementId(int loanAgreementId) {
        this.loanAgreementId = loanAgreementId;
    }

    public LoanProduct getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(LoanProduct loanProduct) {
        this.loanProduct = loanProduct;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public Date getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public void setLoanDisbursalDate(Date loanDisbursalDate) {
        this.loanDisbursalDate = loanDisbursalDate;
    }

    public int getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(int repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    //Calculate EMI
    public void calculateEMI(){
        UtilitiesAll.calculateInstallmentAmount(getLoanAmount(),getRoi(),getTenure(),getRepaymentFrequency());
    }
    //Generate Repayment Schedule
    public void generateRepaymentSchedule(){
        UtilitiesAll.generateRepaymentSchedule(getLoanAmount(),getRoi(),getTenure(), getRepaymentFrequency());
    }
    //Calculate Late Penalty
    public double calculateLatePenalty(Date currentDate){
        return 0.0; // Cannot Understand
    }
    public double calculateLoanToValueRatio(){
        return UtilitiesAll.calculateLTV(getLoanAmount(),getValueOfProperty());
    }
}
