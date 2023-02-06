package assignment2;

public class FinalMain {
    public static void main(String[] args) {
        LoanAgreement la = new LoanAgreement();

        la.setLoanAgreementId(01);
        // la.setLoanProduct();  //Loan Product class is empty as of now
        la.setLoanAmount(500);
        la.setTenure(2);
        la.setRoi(5);

        System.out.println(la.getLoanAmount());

    }
}
