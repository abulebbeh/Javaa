public class MileConversions {
    public static void main(String[] args) {
        final double INCHES_IN_MILE = 63360;
        final double FEET_IN_MILE = 5280;
        final double YARDS_IN_MILE = 1760;
        double miles = 4;

        double miles_to_inch = miles * INCHES_IN_MILE;
        double miles_to_feet = miles * FEET_IN_MILE;
        double miles_to_yards = miles * YARDS_IN_MILE;

        System.out.println("Miles to Inch: "+miles_to_inch);
        System.out.println("Miles to feet: "+miles_to_feet);
        System.out.println("Miles to yards: "+miles_to_yards);
        System.out.println("Number of miles: "+miles);
        System.out.println(miles+" miles is " + miles_to_inch+" inches,or "+miles_to_feet+" feet, or "+miles_to_yards+" yards");
    }
}
