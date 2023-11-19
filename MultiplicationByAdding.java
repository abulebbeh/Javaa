import java.util.Scanner;

public class MultiplicationByAdding {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        int x = input.nextInt();
        System.out.print("Enter another integer >> ");
        int y = input.nextInt();
        System.out.println(x + " * " + y + " = " + mult(x,y));
    }

    public static int mult(int x, int y){
        if(y<0){
            return mult(-x, -y);
        }
        if(x==0 || y==0){
            return 0;
        }
        else{
            return x+mult(x, y-1);
        }
    }
}
