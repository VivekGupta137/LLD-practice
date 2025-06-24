package lld.vendingmachine.entity;

public class IdleState implements MachineState{
    VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(ProductCategory productCategory) {
        this.vendingMachine.setState(new SelectItemState(vendingMachine));
    }

    @Override
    public void insertCoin(Payment payment) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first.");
    }

    @Override
    public void restock(ProductCategory productCategory) {
        this.vendingMachine.setState(new RestockState(vendingMachine));
    }
}
