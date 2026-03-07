import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10,50,"red");
        Food greenApple = new Apple(8,60,"green");

        Food[] cart = {meat, redApple, greenApple};

        ShoppingCart foodCart = new ShoppingCart(cart);

        System.out.println(foodCart.getPriceWithoutDiscounts());
        System.out.println(foodCart.getPriceWithDiscounts());
        System.out.println(foodCart.getPriceIsVegetarian());

    }
}
