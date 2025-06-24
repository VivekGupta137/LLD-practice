package lld.vendingmachine.entity;

public class VendingMachine implements MachineState {
    private MachineState state;
    int earnings;
    ProductCategory selectedProductCategory;

    public VendingMachine() {
        this.state = new SelectItemState(this);
        this.earnings = 0;
    }

    public void setState(MachineState state) {
        this.state = state;
    }

    public ProductCategory getSelectedProductCategory() {
        return selectedProductCategory;
    }

    public void setSelectedProductCategory(ProductCategory selectedProductCategory) {
        this.selectedProductCategory = selectedProductCategory;
    }

    public void reset() {
        this.state = new SelectItemState(this);
        this.selectedProductCategory = null;
    }

    public int withdrawEarnings() {
        int earnings = this.earnings;
        this.earnings = 0;
        return earnings;
    }

    public int addEarnings(int earnings) {
        this.earnings += earnings;
        return this.earnings;
    }


    @Override
    public void selectItem(ProductCategory productCategory) {
        this.state.selectItem(productCategory);
    }

    @Override
    public void insertCoin(Payment payment) {
        this.state.insertCoin(payment);
    }

    @Override
    public void dispenseItem() throws InterruptedException {
        this.state.dispenseItem();
    }

    @Override
    public void restock(ProductCategory productCategory) {
        this.state.restock(productCategory);
    }
}
