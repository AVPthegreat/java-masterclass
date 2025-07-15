public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!, this is 19th lecture of section 3");
        // understanding byte, short, long datatypes and their width in java
        
        System.out.println("Byte Min Value = " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value = " + Byte.MAX_VALUE);
        byte b=127; // This will cause an error because 129 is out of byte range
        System.out.println("Byte Value = " + b);
        
        System.out.println("Short Min Value = " + Short.MIN_VALUE);
        System.out.println("Short Max Value = " + Short.MAX_VALUE);
        
        System.out.println("Long Min Value = " + Long.MIN_VALUE);
        System.out.println("Long Max Value = " + Long.MAX_VALUE);
    }
}