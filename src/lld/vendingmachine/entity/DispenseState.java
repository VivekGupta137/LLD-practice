package lld.vendingmachine.entity;

import lld.vendingmachine.service.ProductService;

public class DispenseState implements MachineState{
    private VendingMachine vendingMachine;
    private ProductService productService;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.productService = ProductService.getInstance();
    }


    @Override
    public void selectItem(ProductCategory productCategory) {
        System.out.println("Invalid operation! dispensing item");
    }

    @Override
    public void insertCoin(Payment payment) {
        System.out.println("Invalid operation! dispensing item");

    }

    @Override
    public void dispenseItem() throws InterruptedException {
        // wait for some time
        System.out.println("Dispensing item "+ vendingMachine.getSelectedProductCategory().getName());
        Thread.sleep(1000);
        productService.reduceStock(vendingMachine.getSelectedProductCategory(), 1);
        this.vendingMachine.reset();
    }

    @Override
    public void restock(ProductCategory productCategory) {
        System.out.println("Invalid operation! dispensing item");
    }
}
