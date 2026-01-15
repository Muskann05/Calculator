import java.util.*;

public class AddTwoNumber {
    public static void main(String[] args) {
        // take input using scanner
        Scanner sc = new Scanner(System.in);
        // take first number 
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        // take second number
         System.err.println("Enter second number");
        int number2 = sc.nextInt();
        // perform addition
        int addition = number1 + number2;
        // print output
        System.out.println("Addition of two number is : " + addition);

    }
}