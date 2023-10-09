import java.util.Scanner;

public class CountByAnything{
    public static void main(String[] args){
        final int START;
        final int STOP;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to count by >> ");
        START = input.nextInt();

        for(int number = START; number <= START * 71; number += START){
            if(number % 10 == 0){
                System.out.println(number);
            }
            else{
                System.out.print(number + " ");
            }
        }
    }
}
