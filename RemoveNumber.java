import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Populate the list with user input
        System.out.println("Enter integers or ZZZ to stop:");
        while (true) {
            String userInput = input.nextLine();
            if ("ZZZ".equalsIgnoreCase(userInput)) {
                break;
            } else {
                try {
                    int number = Integer.parseInt(userInput);
                    list.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid integer or ZZZ to stop.");
                }
            }
        }

        // Display the list using an iterator
        System.out.println("Numbers:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Ask for a number to remove and use the iterator to remove it
        System.out.print("Enter a number to eliminate >> ");
        int numberToRemove = input.nextInt();

        iterator = list.iterator(); // Reinitialize the iterator
        while (iterator.hasNext()) {
            if (iterator.next().equals(numberToRemove)) {
                iterator.remove();
            }
        }

        // Display the list again using an iterator
        System.out.println("Numbers:");
        iterator = list.iterator(); // Reinitialize the iterator again
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        input.close();
    }
}
