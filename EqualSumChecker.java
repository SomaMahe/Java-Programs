import java.util.Scanner;

public class EqualSumChecker {

    // hasEqualSum Method to check if the sum of first two terms is equal to the third number
    public static boolean hasEqualSum(int firstVal,int secondVal, int thirdVal)
    {

        int sumVariable= firstVal + secondVal;
        return sumVariable == thirdVal;


    }
    //Main Method
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter the first number:");
        int firstVal = scan.nextInt();

        System.out.print("Enter the second number:");
        int SecondVal = scan.nextInt();

        System.out.print("Enter the third number:");
        int thirdVal = scan.nextInt();

        // Calling hasEqualSum Method using Class name since it is a static method
        var compareVal = EqualSumChecker.hasEqualSum(firstVal,SecondVal,thirdVal);

        if (compareVal)
            System.out.println("Sum of first two numbers is equal to the third number");
        else
            System.out.println("Sum of first two numbers is not equal to the third number");

    }


}
