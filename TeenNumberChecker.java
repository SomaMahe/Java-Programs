import java.util.Scanner;

/*Program to check if age is between 13 and 19 (both inclusive) to determine Teen age
*/
public class TeenNumberChecker {

    //method isTeen
    public static boolean isTeen(int age){

        if (age >= 13 && age <= 19) {
            return true;
        }
        else return false;
    }

    // method hasTeen
    public static boolean hasTeen(int ageVar1, int ageVar2, int ageVar3) {
        // checking first age
        if (isTeen(ageVar1) || isTeen(ageVar2) || isTeen(ageVar3))
        {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int ageVar1,ageVar2,ageVar3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the ages to check for hasTeen values");
        ageVar1 = scan.nextInt();
        ageVar2 = scan.nextInt();
        ageVar3 = scan.nextInt();

        boolean hasTeenValue= TeenNumberChecker.hasTeen(ageVar1,ageVar2,ageVar3);
        if (hasTeenValue){
            System.out.println("Has teen value");
        }
        else
            System.out.println("No teen value ");


       /* System.out.println("Enter the age to check if it is teen age");
        int ageVar = scan.nextInt();

        boolean isTeenVar = TeenNumberChecker.isTeen(ageVar);
        if (isTeenVar){
            System.out.println("Teenager");
        }
        else
            System.out.println(" Is not a teenager");
*/

    }
}
