public class Burger {
    private String type;
    private int price;
    private boolean isVegetarian;
    private int calories;

    // No-argument constructor
    public Burger() {
        this.type = "Unknown";
        this.price = 0;
        this.isVegetarian = false;
        this.calories = 0;
    }

    // Constructor with all parameters
    public Burger(String type, int price, boolean isVegetarian, int calories) {
        this.type = type;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.calories = calories;
    }

    // Constructor with type and price
    public Burger(String type, int price) {
        this.type = type;
        this.price = price;
        this.isVegetarian = false;  // default value
        this.calories = 0;          // default value
    }

    // Add getters and setters if needed
}
