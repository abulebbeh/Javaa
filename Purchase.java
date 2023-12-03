// Create a Purchase class that implements the Comparable interface
public class Purchase implements Comparable<Purchase> {
    private String category;  // The category of the purchase (e.g., "Groceries")
        // The name of the item purchased (e.g., "Apples")
    private double price;     // The price of the item

    // Constructor to initialize a Purchase object with category, name, and price
    public Purchase(String category, double price) {
        this.category = category;
        this.price = price;
    }

    // Getter method to retrieve the category of the purchase
    public String getCategory() {
        return category;
    }
    
    // Getter method to retrieve the price of the item
    public double getPrice() {
        return price;
    }
    public int compareTo(Purchase price){
        if(this.category.compareTo(price.category)>0){
            return 1;
        }
        else if(this.category.compareTo(price.category)<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}


