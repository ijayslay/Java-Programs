
import java.util.Scanner;
// Java Program to implement
// Nested if statement

public class condition1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Age:");
        int age = s.nextInt();
        if (age > 18) {
            System.out.println("your adult: True");
        } else {
            System.out.println("your minor: False");
        }
        s.close();
    }
}
