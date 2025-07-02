public class Pizza {
    private String crust;
    private String sauce;
    private String[] toppings;
    private int size;

    // 1. Default Constructor
    public Pizza() {
        this.crust = "Regular";
        this.sauce = "Tomato";
        this.toppings = new String[] {};
        this.size = 12; // Assume 12 is a standard size
    }

    // 2. Constructor with Crust and Size
    public Pizza(String crust, int size) {
        this.crust = crust;
        this.sauce = "Tomato";
        this.toppings = new String[] {};
        this.size = size;
    }
    
    // 3. Constructor with All Attributes
    public Pizza(String crust, String sauce, String[] toppings, int size) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.size = size;
    }

    // Optionally, you can also add getters and setters here for the fields
}
