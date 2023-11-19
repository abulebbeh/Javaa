import java.util.Scanner;

public class AddingRecursively {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a number >> ");
        a = input.nextInt();
        System.out.print("Enter another number that is greater than the first number >> ");
        b = input.nextInt();
        
        while (true) {
            if (a < b)
                break;
            else {
                System.out.print("Enter a number >> ");
                a = input.nextInt();
                System.out.print("Enter another number that is greater than the first number >> ");
                b = input.nextInt();
            }
        }

        System.out.println("The sum of all the numbers between" + a + " and " + b + " is " + sum(a, b));
    }

    public static int sum(int a, int b) {
        if (a == b)
            return a;
        return a + sum(a + 1, b);
    }
}
