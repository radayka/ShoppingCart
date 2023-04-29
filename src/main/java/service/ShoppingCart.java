package service;

import model.Apple;
import model.Food;

public class ShoppingCart {
    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    private Food[] foods;

    public double sumFoodsWithoutDiscount() {
        double sum = 0;
        for (Food food : foods) {
            sum += food.getPrice() * food.getAmount();
        }
        return sum;
    }


    public double sumFoodsWithDiscount() {
        double sum = 0;
        for (Food food : foods) {
            double price_amount = food.getPrice() * food.getAmount();
            sum += price_amount - price_amount * (double) food.getDiscount() / 100;


        }
        return sum;
    }

    public double sumVeganFoodsWithoutDiscount() {
        double sum = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getPrice() * food.getAmount();
            }

        }
        return sum;
    }
}