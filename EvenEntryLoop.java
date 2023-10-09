import java.util.Scanner;
public class EvenEntryLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number or 999 to quit >> ");
        int number = input.nextInt();
        
        while(number != 999){
            if(number % 2 == 0){
                System.out.println("Good job!");
            }
            else{
                System.out.println(number + " is not an even number");
            }
            System.out.println("Enter an even number or 999 to quit >> ");
            number = input.nextInt();
        }
    }
}
