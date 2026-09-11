package LifeOS.model;

public class Expense {

    private String category;
    private double amount;

    public Expense(String category, double amount) {

        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Expense cannot be negative."
            );
        }

        this.category = category;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return category + " : Rs." + amount;
    }
}