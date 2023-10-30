import java.util.Scanner;
public class DemoCandles
{
    public static void main(String args[])
    {
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();

        String color;
        int height;
        String scent;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a color for the candle >> ");
        color = input.nextLine();
        candle.setColor(color);
        System.out.println("Enter a height in a whole number of inches >> " );
        height = input.nextInt();
        candle.setHeight(height);
        System.out.println("Enter a color for the scented candle >> ");
        input.nextLine();
        color = input.nextLine();
        scentedCandle.setColor(color);
        System.out.println("Enter a height in a whole number of inches >> " );
        height = input.nextInt(); 
        scentedCandle.setHeight(height);
        System.out.println("Enter a scent. Choose from the following: gardenia, beach, pine, carnation >>");
        input.nextLine();
        scent = input.nextLine();
        scentedCandle .setScent(scent);


        System.out.println("The " + candle.getHeight() + " inch " +
                candle.getColor() + " candle costs $" + candle.getPrice() );
        System.out.println("The " + scentedCandle.getHeight() + " inch " +
                scentedCandle.getScent() + " " + scentedCandle.getColor() + " candle costs $" + scentedCandle.getPrice() );

    }
}
