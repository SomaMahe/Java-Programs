import java.util.Scanner;

public class _Exercise1 {
    // READ INPUTS FROM USER AND FIND THE SUM
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner num1 = new Scanner(System.in);
        int ui1 = num1.nextInt();

        System.out.println("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        int ui2 = num2.nextInt();

        int sum = ui1 + ui2;
        System.out.println("Sum is ");
        System.out.print(sum);


    }
}
