package lms_of_vit_melb;

public class Fine {
    private String fineId;
    private Loan loan;
    private double amount;

    public Fine(String fineId, Loan loan, double amount) {
        this.fineId = fineId;
        this.loan = loan;
        this.amount = amount;
    }

    public String getFineId() {
        return fineId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Fine ID: " + fineId + ", Amount: $" + amount;
    }
}
