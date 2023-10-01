import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){

        int number;
        String a;
        String b;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number >>");
        number = input.nextInt();

        if (isEven(number)){
            System.out.println(number + " is even.");
        }
        else {
            System.out.println(number + " is odd.");
        }

    }
    public static boolean isEven(int n){

        if( n % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
