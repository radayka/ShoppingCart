package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.isVegetarian = true;
        this.colour = colour;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public int getDiscount() {
        if (Objects.equals(colour, Colour.RED)) {
            return Discount.DISCOUNT_60;
        }

        return Discount.DISCOUNT_0;
    }
}
