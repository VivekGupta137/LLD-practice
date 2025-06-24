package lld.vendingmachine.entity;

public class InsertCoinState implements MachineState{
    private VendingMachine vendingMachine;

    public InsertCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(ProductCategory productCategory) {
        System.out.println("Invalid Input! Please insert a coin.");
    }

    @Override
    public void insertCoin(Payment payment) {
        int insertedAmount = payment.getAmount();
        ProductCategory productCategory = vendingMachine.getSelectedProductCategory();
        int remainingAmount = productCategory.getPrice() - insertedAmount;
        if(remainingAmount >= 0) {
            System.out.println("Payment done for "+ productCategory.getName() + ", returning" + remainingAmount + " INR.");
            this.vendingMachine.addEarnings(productCategory.getPrice());
            this.vendingMachine.setState(new DispenseState(vendingMachine));
        }
        else {
            System.out.println("Returning " + insertedAmount + " INR, please insert amount equal to " + productCategory.getPrice() + " INR.");
            System.out.println("Resetting vending machine to initial state");
            this.vendingMachine.reset();
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Invalid Input! Please insert a coin.");
    }

    @Override
    public void restock(ProductCategory productCategory) {
        System.out.println("Invalid Input! Please insert a coin.");
    }
}
