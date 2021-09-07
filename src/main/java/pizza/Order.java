package pizza;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<Pizza> pizzas;

    public Order(String customerName) {
        this.customerName = customerName;
        pizzas = new ArrayList<>();
    }

    @Override
    public String toString() {
        String output = String.format("Order for %s\nOrdered pizzas:\n", this.customerName);
        // iterate over pizzas and append each to the output string
        for (Pizza pizza : pizzas) {
            output += String.format("\t%s: $%5.2f\n", pizza, PizzaPriceCalculator.getPizzaPrice(pizza));
        }
        output += "-------------------\n";
        output += String.format("Order price: $%5.2f", getPrice());
        return output;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        // price of the order is the sum of all pizza prices
        double price = 0;
        for (Pizza pizza : pizzas) {
            price += PizzaPriceCalculator.getPizzaPrice(pizza);
        }
        return price;
    }

}
