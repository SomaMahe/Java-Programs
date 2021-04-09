import java.util.Scanner;

public class DecimalCompare_Main {

    public static void main(String[] args) {

        double d1,d2;

        Scanner scan = new Scanner( System.in );
        System.out.print("Enter the first number:");
        d1 = scan.nextDouble();

        System.out.print("Enter the second number:");
        d2 = scan.nextDouble();
        /*
        Directly calling areEqualByThreeDecimalPlaces using Class name , since the method is static
         */
        boolean returnVal  = DecimalCompare.areEqualByThreeDecimalPlaces(d1,d2);
        if (returnVal)
        {
            System.out.println("The numbers are equal");
        }
        else
        {
            System.out.println("The numbers are not equal");
        }



    }
}
