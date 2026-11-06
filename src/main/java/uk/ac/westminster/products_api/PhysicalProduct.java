package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is something the shop sells, with an id, name and price, that gets shipped in a box.
// A ShoppingCart would NOT pass this test: a cart is not a product, it HAS products in it (HAS-A, not IS-A).
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + "kg";
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}