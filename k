import java.util.*;

// Create a Purchase class that implements the Comparable interface
public class Purchase implements Comparable<Purchase> {
    private String category;  // The category of the purchase (e.g., "Groceries")
    private String name;      // The name of the item purchased (e.g., "Apples")
    private double price;     // The price of the item

    // Constructor to initialize a Purchase object with category, name, and price
    public Purchase(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    // Getter method to retrieve the category of the purchase
    public String getCategory() {
        return category;
    }

    // Getter method to retrieve the name of the item purchased
    public String getName() {
        return name;
    }

    // Getter method to retrieve the price of the item
    public double getPrice() {
        return price;
    }

    // Implement the compareTo method to compare purchases based on their prices
    @Override
    public int compareTo(Purchase otherPurchase) {
        // Use Double.compare to compare prices, which handles NaN and special cases
        return Double.compare(this.price, otherPurchase.price);
    }
}

***

import java.util.*;

// Create a class to manage purchases and calculate totals by category
public class PurchasesArrayListWithTotals {
    private List<Purchase> purchases; // A list to store Purchase objects

    // Constructor to initialize the list of purchases
    public PurchasesArrayListWithTotals() {
        purchases = new ArrayList<>();
    }

    // Method to add a purchase to the list
    public void addPurchase(String category, String name, double price) {
        // Create a Purchase object and add it to the list
        Purchase purchase = new Purchase(category, name, price);
        purchases.add(purchase);
    }

    // Method to calculate the total expenses for each category
    public Map<String, Double> calculateTotalsByCategory() {
        Map<String, Double> categoryTotals = new HashMap<>();
        
        // Iterate through the list of purchases
        for (Purchase purchase : purchases) {
            String category = purchase.getCategory();
            double price = purchase.getPrice();
            
            // If the category is already in the map, add the price to the existing total
            if (categoryTotals.containsKey(category)) {
                categoryTotals.put(category, categoryTotals.get(category) + price);
            }
            // If the category is not in the map, create a new entry with the price
            else {
                categoryTotals.put(category, price);
            }
        }
        
        return categoryTotals;
    }

    public static void main(String[] args) {
        PurchasesArrayListWithTotals purchaseList = new PurchasesArrayListWithTotals(); // Create an instance of the class
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input

        // Taking user input to add purchases
        while (true) {
            System.out.print("Enter category (or 'exit' to finish): ");
            String category = scanner.nextLine();

            if (category.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Add the user input as a purchase to the list
            purchaseList.addPurchase(category, name, price);
        }

        // Calculate and display the totals by category
        Map<String, Double> totals = purchaseList.calculateTotalsByCategory();
        for (Map.Entry<String, Double> entry : totals.entrySet()) {
            System.out.println("Category: " + entry.getKey() + ", Total: $" + entry.getValue());
        }

        scanner.close(); // Close the scanner
    }
}
