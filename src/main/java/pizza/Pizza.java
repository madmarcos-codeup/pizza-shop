package pizza;

public class Pizza {
    private String pizzaType;
    private String size;
    private String crustType;

    public Pizza(String pizzaType, String size, String crustType) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.crustType = crustType;
    }

    @Override
    public String toString() {
        // e.g., Large Thin Pepperoni pizza
        return size + " " + getCrustType() + " " + pizzaType + " pizza";
    }

    // accessors

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        if(crustType.equalsIgnoreCase("thin") || crustType.equalsIgnoreCase("hand-tossed")) {
            return crustType + " crust";
        }
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }
}
