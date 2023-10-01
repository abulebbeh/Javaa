import java.util.Scanner;

public class AscendingAndDescending{
    public static void main(String[] args){

    int number1;
    int number2;
    int number3;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer >>");
    number1 = input.nextInt();
    System.out.println("And another one >>");
    number2 = input.nextInt();
    System.out.println("One more >>");
    number3 = input.nextInt();

    determineAscendingAndDescending(number1, number2, number3);
    }
    
    public static void determineAscendingAndDescending(int n1, int n2, int n3){
        if(n1 > n2 && n1 > n3){
            if(n2 > n3){
                System.out.println("Ascending: " +n3+" " +n2+ " "+ n1);
                System.out.println("Descending: " +n1+ " " +n2+ " " +n3);
            }
            else{
                System.out.println("Ascending: " +n2+ " " +n3+ " " +n1);
                System.out.println("Descending: " +n1+ " " +n3+ " " +n2);
            }
        }
        else{
            if(n2 > n1 && n2 > n3){
                if(n1 > n3){
                    System.out.println("Ascending: " +n3+ " " +n1+ " "+ n2);
                    System.out.println("Descending: " +n2+ " " +n1+ " " +n3);
                }
                else{
                    System.out.println("Ascending: " +n1+ " " +n3+ " " +n2);
                    System.out.println("Descending: " +n2+ " " +n3+ " " +n1);
                }
            }
        else{
            if(n3 > n1 && n3 > n2){
                if(n1 > n2){
                    System.out.println("Ascending: " +n2+ " " +n1+ " " +n3);
                    System.out.println("Descending: " +n3+ " " +n1+ " " +n2);
                }
                else{
                    System.out.println("Ascending: " +n1+ " " +n2+ " " +n3);
                    System.out.println("Descending: " +n3+ " " +n2+ " " +n1);
                 }
                }
            }   
        }
    }
}
