public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!, this is 19th lecture of section 3");
        // understanding byte, short, long datatypes and their width in java

        // byte: 8 bits (1 byte)
        System.out.println("Byte width: " + Byte.SIZE + " bits");
        System.out.println("Byte Min Value = " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value = " + Byte.MAX_VALUE);

        // short: 16 bits (2 bytes)
        System.out.println("\nShort width: " + Short.SIZE + " bits");
        System.out.println("Short Min Value = " + Short.MIN_VALUE);
        System.out.println("Short Max Value = " + Short.MAX_VALUE);

        // long: 64 bits (8 bytes)
        System.out.println("\nLong width: " + Long.SIZE + " bits");
        System.out.println("Long Min Value = " + Long.MIN_VALUE);
        System.out.println("Long Max Value = " + Long.MAX_VALUE);


         // Byte examples (-128 to 127)
        byte minByte = -128;
        byte maxByte = 127;
        byte someByteValue = 100;
        System.out.println("Byte values: " + minByte + ", " + maxByte + ", " + someByteValue);

        // Short examples (-32,768 to 32,767)
        short minShort = -32768;
        short maxShort = 32767;
        short someShortValue = 30000;
        System.out.println("Short values: " + minShort + ", " + maxShort + ", " + someShortValue);

        // Long examples (need L suffix for long literals)
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;
        long someLongValue = 123456789L;
        System.out.println("Long values: " + minLong + ", " + maxLong + ", " + someLongValue);

        // You can also use the wrapper class constants
        byte anotherByte = Byte.MIN_VALUE;
        short anotherShort = Short.MAX_VALUE;
        long anotherLong = Long.MIN_VALUE;

        System.out.println("Another Byte: " + anotherByte);
        System.out.println("Another Short: " + anotherShort);
        System.out.println("Another Long: " + anotherLong);
    }
}