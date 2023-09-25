import java.util.Scanner;
class TestSandwich{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         String ingredient;
         String bread;
         double price;

         System.out.print("Enter ingredient: ");
         ingredient = input.nextLine();
         System.out.print("Enter bread: ");
         bread = input.nextLine();
         System.out.print("Enter price: ");
         price = input.nextDouble();

         Sandwich sandwich = new Sandwich();
         sandwich.setMainIngredient(ingredient);
         sandwich.setBread(bread);
         sandwich.setPrice(price);
         System.out.println("You have ordered a " + sandwich.getMainIngredient() + " sandwich on " + sandwich.getBread() + " bread, and the price is " + sandwich.getPrice());

     }
}
