package lld.vendingmachine.entity;

public interface ProductCategory {
    String getName();
    int getPrice();
    int getQuantity();
    int reduceQuantity(int quantity);
    int addQuantity(int quantity);
}
