package lld.vendingmachine.entity;

public interface MachineState {
    void selectItem(ProductCategory productCategory);
    void insertCoin(Payment payment);
    void dispenseItem() throws InterruptedException;
    void restock(ProductCategory productCategory);
}
