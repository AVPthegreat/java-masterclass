public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!, this is 18th lecture of section 3");
        int myIntVar = 1000;
        System.out.println(myIntVar);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value: " + myMinIntValue);
        System.out.println("Maximum Integer Value: " + myMaxIntValue);

        // in this lecture we learn about integer variables and their limits and combining integers and text in single print statements

        // below is condition of integer overflow
        
        System.out.println("Busted Max Integer Value: " + (myMaxIntValue + 1));
        System.out.println("Busted Min Integer Value: " + (myMinIntValue - 1));

        // explained overflow and underflow in integers using variables, limits of integers, and how to print them with text. 
        // in java integers are 32 bit signed values, which means they can hold values from -2,147,483,648 to 2,147,483,647.
        // we also learned about how to print variables with text in single print statements.
        // we can use + operator to concatenate strings and variables in print statements.
        // in java you cannot print integers with commas, you have to use _ operator to separate thousands, millions, etc.
 
    }
}


