import java.util.Scanner;

public class AddingRecursively2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a number >> ");
        a = in.nextInt();
        System.out.print("Enter another number that is greater than the first number >> ");
        b = in.nextInt();

        if (a > b)
            System.out.println("The sum of all the numbers between" + b + " and " + a + " is " + sum(b, a));
        else
            System.out.println("The sum of all the numbers between" + a + " and " + b + " is " + sum(a, b));
    }

    public static int sum(int a, int b) {
        if (a == b)
            return a;
        return a + sum(a + 1, b);
    }
}
