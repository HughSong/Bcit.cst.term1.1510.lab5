/**
 * 
 */
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Salary.
 * @author ������
 * @version:1.0
 */
public class Salary {

    /**
     * Drive my program
     * @param args args command line arguments.
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double currentSalary; // employee's current salary
        double raise; // amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        // Compute the raise using if ...
            if (rating.equals("Excellent"))
                raise = 0.06 * currentSalary;
            else if (rating.equals("Good"))
                raise = 0.04 * currentSalary;
            else 
                raise = 0.015 * currentSalary;
        newSalary = currentSalary + raise;
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println( "Your new salary: " + money. format (newSalary) );
        System.out.println();
    }

}
