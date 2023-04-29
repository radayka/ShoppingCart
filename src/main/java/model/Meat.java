package model;

import model.constants.Discount;

public class Meat extends Food {
    public Meat(int amount, double price) {
        this.isVegetarian = false;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public int getDiscount() {
        return Discount.DISCOUNT_0;
    }
}
