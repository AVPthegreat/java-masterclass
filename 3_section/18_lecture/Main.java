public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!, this is 17th lecture of section 3");
        int myIntVar = 1000;
        System.out.println(myIntVar);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value: " + myMinIntValue);
        System.out.println("Maximum Integer Value: " + myMaxIntValue);

        // in this kecture we learn about integer variables and their limits and combining integers and text in single print statements

        // below is condition of integer overflow
        
        System.out.println("Busted Max Integer Value: " + (myMaxIntValue + 1));
        System.out.println("Busted Min Integer Value: " + (myMinIntValue - 1));
    }
}