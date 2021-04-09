// Exercise 4: Program to print KB to MB and remaining KB

import java.util.Scanner;

public class MegaByteConverter {
    //method printMegaBytesAndKiloBytes
    public static void  printMegaBytesAndKiloBytes(int kiloBytes)
    {

        // calculating MB and remaining KB
        int MegaByteVar = kiloBytes / 1024;
        int remKBVar = kiloBytes % 1024;

        if (kiloBytes < 0)
            System.out.println("Invalid value");
        else
            System.out.println(" "+ kiloBytes +" "+"KB" +"="+" "+MegaByteVar+" "+"MB"+" "+"and"+" "+remKBVar+" "+"KB");


    }
    public static void main(String[] args) {
        int KBVar;
        Scanner scan = new Scanner(System.in);
        // Get user input
        System.out.println("Enter the Kilobytes");
        KBVar = scan.nextInt();

        //calling static method printMegaBytesAndKiloBytes
        MegaByteConverter.printMegaBytesAndKiloBytes(KBVar);








    }
}
