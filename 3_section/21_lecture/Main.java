public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!, this is 21st lecture of section 3");
        byte var1=10;
        short var2=20;
        int var3=50;
        int sum = var1 + var2 + var3;
        long var4 = 50000L + (10 * sum);
        System.out.println("The value of long variable is: " + var4);
        //long var4 = (long)(50000 + 10 * (var1 + var2 + var3));
        //long var4 = 50000L + 10L * (var1 + var2 + var3);


        //✅ Rule of thumb:
        //When going from smaller → bigger (like int → long), Java does it automatically.
        //When going from bigger → smaller (long → int), you need an explicit cast.
    }
}