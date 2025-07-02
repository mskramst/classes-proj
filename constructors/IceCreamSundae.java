public class IceCreamSundae {
    private String flavor;
    private String topping;
    private boolean whippedCream;
    private boolean cherry;
    private double price;

    // Constructor 1: Default constructor
    public IceCreamSundae() {
        this.flavor = "Vanilla";
        this.topping = "Chocolate Syrup";
        this.whippedCream = false;
        this.cherry = false;
        this.price = 3.99;
    }

    // Constructor 2: Constructor with flavor and topping
    public IceCreamSundae(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
        this.whippedCream = false;
        this.cherry = false;
        this.price = 4.99;
    }

    // Constructor 3: Full constructor with all fields
    public IceCreamSundae(String flavor, String topping, boolean whippedCream, boolean cherry, double price) {
        this.flavor = flavor;
        this.topping = topping;
        this.whippedCream = whippedCream;
        this.cherry = cherry;
        this.price = price;
    }

    // Getters and Setters could be added here if needed
}
