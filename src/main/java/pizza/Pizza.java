package pizza;

public class Pizza {
    private String pizzaType;
    private SizeType size;
    private CrustType crust;

    public Pizza(String pizzaType, SizeType size, CrustType crust) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.crust = crust;
    }

    @Override
    public String toString() {
        // e.g., Large Thin Pepperoni pizza
        return getSize() + " " + getCrustType() + " " + pizzaType + " pizza";
    }

    // accessors

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSize() {
        String sizeString = "Unknown size";
        switch(size) {
            case SMALL:
                sizeString = "Small";
                break;
            case MEDIUM:
                sizeString = "Medium";
                break;
            case LARGE:
                sizeString = "Large";
                break;
            case EXTRA_LARGE:
                sizeString = "Extra-large";
                break;
            default:
                break;
        }
        return sizeString;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public String getCrustType() {
        String crustString = "Unknown crust";
        switch(crust) {
            case PAN:
                crustString = "Pan";
                break;
            case THIN:
                crustString = "Thin crust";
                break;
            case HAND_TOSSED:
                crustString = "Hand-tossed crust";
                break;
            default:
                break;
        }
        return crustString;
    }

    public void setCrustType(CrustType crust) {
        this.crust = crust;
    }

    public SizeType getSizeRaw() {
        return size;
    }

    public CrustType getCrustRaw() {
        return crust;
    }
}
