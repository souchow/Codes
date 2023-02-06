package assignment2;
import assignment1.*;

import java.util.Date;

public class Customer {

    private int customerId;
    private String customerName;
    public Customer(){
        customerName = "Sourav";
    }
    private Date dateOfBirth;
    private String contactNumber;
    private String emailAddress;
    private double monthlyIncome;
    private String profession;
    private double totalMonthlyExpenses;
    private double maxEligibleLoanAmount;
    private String designation;
    private String companyName;
    private double interestRate;
    public int tenure;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }

    public void setTotalMonthlyExpenses(double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
    }

    public double getMaxEligibleLoanAmount() {
        return maxEligibleLoanAmount;
    }

    public void setMaxEligibleLoanAmount(double maxEligibleLoanAmount) {
        this.maxEligibleLoanAmount = maxEligibleLoanAmount;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //Count Number of Object
    public static int count = 0;
    {
        count++;
    }
    public void display(){
        System.out.println(count);
    }

    //Calculate DBR
    public double calculateDBR(){
        return UtilitiesAll.calculateDBR(getTotalMonthlyExpenses(), getMonthlyIncome());
    }
    //Calculate Max ELigible EMI:
    public double calculateMaxEligibleEMI(){
        return UtilitiesAll.calculateMaxEligibleEMI(getMonthlyIncome());
    }

    //Calculate Eligible Loan Amount
    public double calculateEligibleLoanAmount(){
        return UtilitiesAll.calculateMaxLoanEligibility(getMonthlyIncome(), this.interestRate,this.tenure);
    }
}
