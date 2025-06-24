package lld.vendingmachine;

import lld.Driver;
import lld.vendingmachine.entity.*;
import lld.vendingmachine.service.ProductService;

public class VendingMachineDriver implements Driver {

    @Override
    public void start() throws InterruptedException {
        VendingMachine vendingMachine = new VendingMachine();
        ProductService productService = ProductService.getInstance();

        ProductCategory mobile1 = new Mobile("OnePlus", 1000, 10);

        productService.addProduct(mobile1);

        vendingMachine.selectItem(mobile1);

        CashPayment payment = new CashPayment(500);
        vendingMachine.insertCoin(payment);

        vendingMachine.dispenseItem();

        CashPayment payment1 = new CashPayment(1000);
        vendingMachine.insertCoin(payment1);
        vendingMachine.selectItem(mobile1);
        vendingMachine.insertCoin(payment1);
        vendingMachine.dispenseItem();


        int earnings = vendingMachine.withdrawEarnings();
        System.out.println("Earnings: " + earnings);


    }
}
