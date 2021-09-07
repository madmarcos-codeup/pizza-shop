package pizza;

import java.util.ArrayList;

public class PizzaShop {

    public static void main(String[] args) {
        Order order1 = new Order("Bob Smith");
        order1.addPizza(new Pizza("Pepperoni", SizeType.LARGE, CrustType.THIN));
        order1.addPizza(new Pizza("Cheese", SizeType.SMALL, CrustType.HAND_TOSSED));

        System.out.println(order1);
    }

    public static ArrayList<Pizza> makePizzas() {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("Pepperoni", SizeType.LARGE, CrustType.THIN));
        pizzas.add(new Pizza("Cheese", SizeType.SMALL, CrustType.HAND_TOSSED));
        pizzas.add(new Pizza("Supreme", SizeType.EXTRA_LARGE, CrustType.PAN));

        return pizzas;
    }

    private static void printPizzas(ArrayList<Pizza> pizzas) {
        System.out.println("We currently have the following pizzas for sale:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
