import java.util.Scanner;
public class DemoHorses
{
    public static void main(String args[])
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();

        String name; 
        String color;
        int birthYear;
        int races; 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name for horse >> ");
        horse1.name = input.nextLine();
        System.out.println("Enter color for " + horse1.getName() + ">> " );
        horse1.color = input.nextLine();
        System.out.println("Enter year of birth >> ");
        horse1.birthYear = input.nextInt();
        input.nextLine();

        System.out.println("Enter name for race horse >> ");
        horse2.name = input.nextLine();
        System.out.println("Enter color for " + horse2.getName() + " >> " );
        horse2.color = input.nextLine();
        System.out.println("Enter year of birth >> ");
        horse2.birthYear = input.nextInt();
        System.out.println("Enter number of races for " + horse2.getName() + ">> ");
        horse2.races = input.nextInt();

        System.out.println(horse1.getName() + " is " +
                horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " +
                horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " +
                horse2.getRaces() + " races.");
    }
}
