package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items.clone();
    }

    public double getPriceWithoutDiscounts() {
        double sum = 0;
        for (Food item : items) {
            sum += item.getPrice() * item.getAmount();
        }
        return sum;
    }

    public double getPriceWithDiscounts() {
        double sum = 0;
        for (Food item : items) {
            sum += ((item.getPrice() - (item.getPrice() * item.getDiscount() / 100)) * item.getAmount());
        }
        return sum;
    }

    public double getPriceIsVegetarian() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getPrice() * item.getAmount();
            }
        }
        return sum;
    }

}
