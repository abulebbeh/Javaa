import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Purchase implements Comparable<Purchase> {
    private String category;
    private String name;
    private double price;

    public Purchase(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Purchase other) {
        // Compare purchases based on their categories
        return this.category.compareTo(other.getCategory());
    }

    @Override
    public String toString() {
        return category + " - " + name + " - $" + price;
    }
}

class PurchasesArrayListWithTotals {
    private List<Purchase> purchases;

    public PurchasesArrayListWithTotals() {
        this.purchases = new ArrayList<>();
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public void calculateTotalsByCategory() {
        // Sort the purchases by category
        Collections.sort(purchases);

        String currentCategory = null;
        double categoryTotal = 0.0;

        for (Purchase purchase : purchases) {
            if (currentCategory == null || !currentCategory.equals(purchase.getCategory())) {
                if (currentCategory != null) {
                    System.out.println("Total for category " + currentCategory + ": $" + categoryTotal);
                }
                currentCategory = purchase.getCategory();
                categoryTotal = 0.0;
            }
            categoryTotal += purchase.getPrice();
        }

        // Print the last category's total
        if (currentCategory != null) {
            System.out.println("Total for category " + currentCategory + ": $" + categoryTotal);
        }
    }

    public static void main(String[] args) {
        PurchasesArrayListWithTotals purchasesArrayList = new PurchasesArrayListWithTotals();
        
        purchasesArrayList.addPurchase(new Purchase("Electronics", "Laptop", 1000.0));
        purchasesArrayList.addPurchase(new Purchase("Clothing", "Shirt", 25.0));
        purchasesArrayList.addPurchase(new Purchase("Electronics", "Smartphone", 500.0));
        purchasesArrayList.addPurchase(new Purchase("Clothing", "Jeans", 50.0));
        
        purchasesArrayList.calculateTotalsByCategory();
    }
}
