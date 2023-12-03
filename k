public class Purchase implements Comparable<Purchase> {
    private String category;
    private double price;

    // Constructor
    public Purchase(String category, double price) {
        this.category = category;
        this.price = price;
    }

    // Getter methods
    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // compareTo() method for sorting by category
    @Override
    public int compareTo(Purchase otherPurchase) {
        return this.category.compareTo(otherPurchase.getCategory());
    }

    // toString() method for better representation
    @Override
    public String toString() {
        return "Category: " + category + ", Price: " + price;
    }
}

*****


public static void main(String[] args) {
    // Creating Purchase objects
    Purchase purchase1 = new Purchase("Groceries", 50.0);
    Purchase purchase2 = new Purchase("Electronics", 120.0);
    Purchase purchase3 = new Purchase("Clothing", 30.0);

    // Sorting Purchase objects by category
    List<Purchase> purchases = new ArrayList<>(Arrays.asList(purchase1, purchase2, purchase3));
    Collections.sort(purchases);

    // Displaying sorted Purchase objects
    for (Purchase purchase : purchases) {
        System.out.println(purchase);
    }
}


****



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PurchasesArrayListWithTotals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Purchase> purchasesList = new ArrayList<>();

        // Continually prompt the user for Purchase categories and prices
        while (true) {
            System.out.print("Enter category for purchase or ZZZ to quit >> ");
            String category = scanner.nextLine();

            if (category.equalsIgnoreCase("ZZZ")) {
                break; // Exit the loop if the user enters ZZZ
            }

            System.out.print("Enter amount spent >> ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Create a new Purchase object and add it to the ArrayList
            Purchase purchase = new Purchase(category, price);
            purchasesList.add(purchase);
        }

        // Sort the Purchase objects by category
        Collections.sort(purchasesList);

        // Display the Purchase object details with a total following each category
        String currentCategory = "";
        double categoryTotal = 0.0;

        for (Purchase purchase : purchasesList) {
            if (!purchase.getCategory().equals(currentCategory)) {
                if (!currentCategory.isEmpty()) {
                    System.out.println("Total for " + currentCategory + ": " + categoryTotal);
                }
                currentCategory = purchase.getCategory();
                categoryTotal = 0.0;
            }

            System.out.println("Category: " + purchase.getCategory() + ", Price: " + purchase.getPrice());
            categoryTotal += purchase.getPrice();
        }

        // Display the total for the last category
        System.out.println("Total for " + currentCategory + ": " + categoryTotal);
    }
}
