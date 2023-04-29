import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class MainApplication {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] foods = new Food[]{meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.sumFoodsWithoutDiscount() + " рублей.");
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.sumFoodsWithDiscount() + " рублей.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.sumVeganFoodsWithoutDiscount() + " рублей.");
    }
}
