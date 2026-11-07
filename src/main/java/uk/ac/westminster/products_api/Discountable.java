package uk.ac.westminster.products_api;

public interface Discountable {
    // A contract: no bodies, no fields, no constructor.
    void applyDiscount(double rate);
    double getDiscountedPrice();
}