
/**
 * 
 */


/**
 * Name.
 * 
 * @author ËÎÓëçñ
 * @version:1.0
 */
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullname;

    /**
     * Constructor.
     * @param first the first name
     * @param middle
     * @param last
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    /**
     * get the first name
     * @return first name
     */
    public String getFirst() {
        return firstName;
    }

    // TODO Auto-generated method stub
    /**
     * get the middle name
     * @return middle name
     */
    public String getMiddle() {

        return middleName;
    }
    /**
     * get the last name
     * @return last name
     */
    public String getLast() {

        return lastName;
    }
    /**
     * get the the full name in a order.
     * @return first name middle name and last name.
     */
    public String firstMiddleLast() {

        return (firstName + "-" + middleName + "-" + lastName);
    }
    /**
     * get the the full name in a order.
     * @return last name middle name and first name
     */
    public String lastMiddleFirst() {
        return (lastName + "-" + middleName + "-" + firstName);
    }
    /**
     * get the full name
     * @return full name
     */
    public String getfullname() {
        fullname = firstName + middleName + lastName;
        return fullname;
    }
    /**
     * determine whether the names are same 
     * @param otherName
     * @return true of false 
     */
    public boolean equals(Name otherName) {

        return this.getfullname().equalsIgnoreCase(otherName.getfullname());

    }
    /**
     * get the first letters of the first, middle and last name.
     * @return first letters of the first, middle and last name.
     */
    public String initials() {
        String first = firstName.substring(0, 1);
        first = first.toUpperCase();
        String middle = middleName.substring(0, 1);
        middle = middle.toUpperCase();
        String last = lastName.substring(0, 1);
        last = last.toUpperCase();
        return (first + middle + last);
    }
    /**
     * figure out how many characters that our name have
     * @return length of the full name
     */
    public int length() {
        int num1 = firstName.length();
        int num2 = middleName.length();
        int num3 = lastName.length();
        int sum = num1 + num2 + num3;
        return sum;
    }
}
