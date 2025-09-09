public class Main {
    public static void main(String[] args) {
        System.out.println("in las lecture we learned about byte, short and long datatypes and their width in java, and in this lecture we will learn about basic arithmetic operations in java using data types we learned so far");
        System.out.println("and we will be doing discussion about casting , which is converting one data type to another data type in java in this lecture, why to do it and how to do it, why it is necessary and when to do it");
        System.out.println("Hello, World!, this is 20th lecture of section 3");
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        short shortVar1 = Short.MIN_VALUE;
        int intVar1 = Integer.MIN_VALUE;
        System.out.println("Short Min Value: " + shortVar1 + " and Int Min Value: " + intVar1);

        byte mysmallbytevalue = Byte.MIN_VALUE, mybigbytevalue = Byte.MAX_VALUE;
        System.out.println("My Small Byte Value: " + mysmallbytevalue + " and My Big Byte Value: " + mybigbytevalue);
        //  putting multiple statements in single line is legal in java but should have a comma in between and ends with semicolon, but no two different type of datatypes can be put in single line exqmple is below
        // int myintvalue = Integer.MIN_VALUE, mybigintvalue = Integer.MAX_VALUE; // legal
        // int myintvalue = Integer.MIN_VALUE, mybigbytevalue = Byte.MAX_VALUE; // illegal
        // This would cause a compilation error without casting
        // byte result = mysmallbytevalue + mybigbytevalue; // Error!


        // we use casting to convert one data type to another data type in java, because in java when we do arithmetic operations on smaller data types like byte and short, they are automatically promoted to int, so if we want to store the result back to byte or short, we need to cast it explicitly, otherwise it will cause a compilation error.
        // Correct way with casting
        byte result = (byte) (mysmallbytevalue + mybigbytevalue);
        System.out.println("Result after casting: " + result); 

    }
}