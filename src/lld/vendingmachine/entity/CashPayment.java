package lld.vendingmachine.entity;

public class CashPayment implements Payment{

    private int amount;

    public CashPayment(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Trasaction started for "+ amount + " INR.");
    }
}
