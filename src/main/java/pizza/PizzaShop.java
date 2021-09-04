package pizza;

import java.util.ArrayList;

public class PizzaShop {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaStack1 = makePizzas();
        ArrayList<Pizza> pizzaStack2 = makePizzas();
        pizzaStack2.remove(pizzaStack2.size() - 1);

        printPizzas(pizzaStack1);
        printPizzas(pizzaStack2);
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
