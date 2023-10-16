import java.util.*;
public class BabyNameComparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1, name2, name3;
        System.out.print("Enter a name >> ");
        name1 = sc.nextLine();
        System.out.print("Enter a second name >> ");
        name2 = sc.nextLine();
        System.out.print("Enter a third name >> ");
        name3 = sc.nextLine();

        System.out.println("The combinations are:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }
}
