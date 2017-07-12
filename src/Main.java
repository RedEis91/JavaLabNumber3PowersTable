import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main (String[] args)

    {
        System.out.println("Let's get exponential!");
        String contin;
        do {

            Scanner scan = new Scanner(System.in);
            int userNum;
            System.out.println(" ");
            System.out.println("Please enter a whole number: ");
            System.out.println(" ");
            userNum = scan.nextInt();
            System.out.println(" ");
            System.out.println("Number\t Squared \t Cubed");
            System.out.println("======\t =======\t =====");
            for (int i = 1; i <= userNum; i++)
            {

                System.out.println(i + "    \t " + (int)Math.pow(i, 2) + "    \t     " + (int)Math.pow(i, 3) );
            }
            System.out.println(" ");
            System.out.println("Do you want to continue?\t Y/N: ");
            System.out.println(" ");
            contin = scan.next();
            System.out.println(" ");

        } while (contin.contains("Y") || contin.contains("y"));
        System.out.println("Numbers are tight!\tThanks for playing!");
    }
}
