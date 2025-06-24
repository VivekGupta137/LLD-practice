package lld.vendingmachine.entity;

import lld.vendingmachine.service.ProductService;

public class RestockState implements MachineState{
    VendingMachine vendingMachine;
    private ProductService productService;

    public RestockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.productService = ProductService.getInstance();

    }

    @Override
    public void selectItem(ProductCategory productCategory) {

    }

    @Override
    public void insertCoin(Payment payment) {

    }

    @Override
    public void dispenseItem() {

    }

    @Override
    public void restock(ProductCategory productCategory) {
        productService.addProduct(productCategory);
        this.vendingMachine.reset();
    }
}
