package pizza;

public class PizzaPriceCalculator {
    public static double getPizzaPrice(Pizza pizza) {
        double price = 0;

        switch(pizza.getSizeRaw()) {
            case SMALL:
                price = 1f;
                break;
            case MEDIUM:
                price = 2f;
                break;
            case LARGE:
                price = 4f;
                break;
            case EXTRA_LARGE:
                price = 7f;
                break;
        }
        switch (pizza.getCrustRaw()) {
            case THIN:
                price += 1f;
                break;
            case HAND_TOSSED:
                price += 2f;
                break;
            case PAN:
                price += 3f;
                break;
        }
        return price;
    }
}
