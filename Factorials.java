/**
 * 
 */
import java.util.Scanner;
/**
 * Factorials.
 * @author ֻ־׃כחס
 * @version 1.0
 */
public class Factorials {

    /**
     * drive the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num1;
        int result = 1;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer: ");
        num1 = scan.nextInt();
        while (num1<0)
        {
            System.out.println("A nonnegative number is required,"
                    + " please try again to enter a non-negative integer: ");
            num1 = scan.nextInt();
        }
        while (i<=num1)
        {
            result = result * i;
            i++;
        }
        System.out.println("The result of " + num1 + "! is: " + result);
    }

}
