import java.util.Scanner;
public class DebugTwo2
{
   public static void main(String args[])
   { 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      int a = input.nextInt();
      System.out.print("Enter another integer >> ");
      int b = input.nextInt();
      System.out.println("The sum is " + (a + b));
      System.out.println("The difference is " + (a - b));
      System.out.println("The product is " + (a * b));
   }
}
