package lld.vendingmachine.entity;

public class Mobile implements ProductCategory{
    private String name;
    private int price;
    private int quantity;

    public Mobile(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public int reduceQuantity(int quantity) {
        this.quantity -= quantity;
        return this.quantity;
    }

    @Override
    public int addQuantity(int quantity) {
        this.quantity += quantity;
        return this.quantity;
    }
}
