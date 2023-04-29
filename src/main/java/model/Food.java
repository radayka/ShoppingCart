package model;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;


    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getAmount() {
        return amount;
    }
}
