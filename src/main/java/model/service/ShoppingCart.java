package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items){
        this.items = items;
    }

    public double getPriceWithoutDiscounts(){
        double sum = 0;
        for(int i = 0; i < items.length; i++){
            sum = sum + items[i].getPrice() * items[i].getAmount();
        }
        return sum;
    }

    public double getPriceWithDiscounts(){
        double sum = 0;
        for(int i = 0; i < items.length; i++){
            sum = sum + ((items[i].getPrice() - (items[i].getPrice() * items[i].getDiscount()/100)) * items[i].getAmount());
        }
        return sum;
    }

    public  double getPriceIsVegetarian(){
        double sum = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i].isVegetarian() == true){
                sum = sum + items[i].getPrice() * items[i].getAmount();
            }
        }
        return sum;
    }

}
