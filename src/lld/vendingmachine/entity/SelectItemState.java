package lld.vendingmachine.entity;

public class SelectItemState implements MachineState{
    private VendingMachine vendingMachine;

    public SelectItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(ProductCategory productCategory) {
        this.vendingMachine.setSelectedProductCategory(productCategory);
        this.vendingMachine.setState(new InsertCoinState(vendingMachine));
    }

    @Override
    public void insertCoin(Payment payment) {
        System.out.println("Please select a product first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select a product first.");
    }

    @Override
    public void restock(ProductCategory productCategory) {
        System.out.println("Please select a product first.");
    }
}
