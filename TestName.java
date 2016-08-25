import java.util.Scanner;

/**
 * To get name from users.
 * @author ËÎÓëçñ
 * @version:1.0
 */
public class TestName {

    /**
     * Drive the program
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        String firstname1, middlename1, lastname1, firstname2,middlename2,lastname2;;
        // TODO Auto-generated method stub
        
        System.out.println("The name of first people: ");      
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first name: ");
        firstname1 = scan.nextLine();

        System.out.println("Please enter the middle name: ");
        middlename1 = scan.nextLine();

        System.out.println("Please enter the last name: ");
        lastname1 = scan.nextLine();
        Name people1 = new Name(firstname1,middlename1,lastname1);
        System.out.println("The first-middle-last version is: " + people1.firstMiddleLast());
        System.out.println("The last-first-middle version is: " + people1.lastMiddleFirst());
        System.out.println("The initails are: " + people1.initials());
        System.out.println("The length of the name is: " + people1.length() + " characters");
        System.out.println();
        System.out.println("----------------------------");
        
        System.out.println("Please enter the first name: ");
        firstname2 = scan.nextLine();

        System.out.println("Please enter the middle name: ");
        middlename2 = scan.nextLine();

        System.out.println("Please enter the last name: ");
        lastname2 = scan.nextLine();
        Name people2 = new Name(firstname2,middlename2,lastname2);
        
       
        System.out.println("The name of second people: ");
        people2.getFirst();
        people2.getMiddle();
        people2.getLast();
        people2.getfullname();
        System.out.println("The first-middle-last version is: " + people2.firstMiddleLast());
        System.out.println("The last-first-middle version is: " + people2.lastMiddleFirst());
        System.out.println("The initails are: " + people2.initials());
        System.out.println("The length of the name is: " + people2.length() + " characters");
        
        if(people1.equals(people2))
        {
            System.out.println("names are some");
        }
        else
            System.out.println("NOT SAME");
    }
    
}
