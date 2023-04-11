import java.util.Scanner;
public class StepFirst {
    public static void main(String[] args) {
        int integerV = 1;
        long longV = 1231231L;
        short shortV = 13312;
        byte byteV = 123;

        float floatV = 2.5F;
        double doubleV = 2.2;

        char charV = 'f';

        boolean booleanV = true;

        System.out.println(Integer.toString(integerV) + longV + shortV + byteV + floatV + doubleV + charV + booleanV);

        //Step 2

        double a = 1;
        double b = 1;
        double c = 1;
        double p = (a + b + c) / 2;
        double triangleS = p * (p - a) * (p - b) * (p - c);
        double sqrtTriangle = Math.sqrt(triangleS);

        System.out.println("Square of triangle is " + sqrtTriangle);

        int i = 10;
        int x = ++i;
        System.out.println("i is " + Integer.toString(i) + " ++i is " + x);
        int y = i++;
        System.out.println("i is " + Integer.toString(i) + " i++ is " + y);
        int z = --i;
        System.out.println("i is " + Integer.toString(i) + " --i is " + z);
        int w = i--;
        System.out.println("i is " + Integer.toString(i) + " i-- is " + w);


        //Step 3
        /*Task 1: create a program, that will scan int value from console and print first
         message if value less than 10, second message if larger, than 10 and if it is equal to 0 - third message.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int number: ");
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println("Your input less 10");
        } else if (number > 10) {
            System.out.println("Your input more 10");
        } else if (number == 0) {
            System.out.println("Your input equal 0"); // need to be first condition
        }

        /*Task 2: create a program, that will scan double value from console and
        if value is odd - first message printing to console, if even - second message printing to console.
         */
        System.out.print("Input double number: ");
        double scanDouble = scanner.nextDouble() * 2;
        if (scanDouble % 2 != 0) {
            System.out.println("Your value is odd");
        } else {
            System.out.println("Your value is even");
        }
        /* create a program, that will scan float value from console and if this value
        is divisible without remainder by 2 and larger than 10 or if value equals 15 - first message is printing
         to the console, if not - second message is printing to console.
         */
        System.out.print("Input float number: ");
        float scanFloat = scanner.nextFloat();
        if (scanFloat % 2 == 0) {
            if (scanFloat > 10) {
                if (scanFloat == 15) {
                    System.out.println("is divisible without remainder by 2 and larger than 10 or if value " +
                            "           equals 15");
                }
            }
        }
        System.out.println("Second message");
    }
}