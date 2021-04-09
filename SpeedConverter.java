import java.util.Scanner;

// Program to covert speed in kilometer per hour to miler per hour
    public class SpeedConverter {

    // method to convert speed in Kmph to miles per hour
    public static long toMilesPerHour(double kilometersPerHour){

        double  milesPerHour ;
        long roundedValue;
        if (kilometersPerHour < 0)
        {
            return -1;
        }
        else
        {
         milesPerHour = kilometersPerHour / 1.609;
         roundedValue = Math.round(milesPerHour);
         return roundedValue;
        }

    }
    // method to print the converted value in miles per hour
    public static void printConversion( double kilometersPerHour){

        long convertedValue =  SpeedConverter.toMilesPerHour(kilometersPerHour);

        if (convertedValue< 0)
        {
            System.out.println("Invalid Value");

        }
        else
        {
            System.out.println(""+kilometersPerHour+""+"km/h"+""+" = "+convertedValue+""+" mi/h");
        }



    }


    public static void main(String[] args) {

        double kilometersPerHour;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the speed in kilometer per hour");
        kilometersPerHour = scan.nextDouble();

        SpeedConverter.printConversion(kilometersPerHour);




    }
}
