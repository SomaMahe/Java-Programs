// Program to check for leap year

import java.util.Scanner;

public class leapYearCalculator {

    public static  boolean isLeapYear(int year){
        //checking if year >=1 and year <=9999
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0) return true;
            else if (year % 100 == 0) return true;
            else if (year % 400 == 0) return true;
            else return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {

        int yearVar = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");

        yearVar =scan.nextInt();

        //calling function isLeapYear
        boolean isLeapYearVar = leapYearCalculator.isLeapYear(yearVar);

        if (isLeapYearVar) {
            System.out.println(""+yearVar+" "+"is a leap year");
        }
        else
        {
            System.out.println(""+yearVar+" "+"is not a leap year");
        }





    }
}

