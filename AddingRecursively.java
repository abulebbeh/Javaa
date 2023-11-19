import java.util.Scanner;
public class AddingRecursively{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number >> ");
        int firstInt = scanner.nextInt();
        System.out.print("Enter a second number >> ");
        int secondInt = scanner.nextInt();

        if(firstInt > secondInt){
            System.out.println("Enter a number larger than " + firstInt);
            return;
        }

        int result = sum(firstInt, secondInt);
        System.out.println("The sum of all the numbers between " + firstInt + " and " + secondInt + " is " + result);
    }
        public static int sum(int start, int end){
            if(start == end){
                return start;
            } 
            else{
                return start + sum(start + 1, end);
            }
        }
}
