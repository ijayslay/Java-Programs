import java.util.Scanner;

class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking age as input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // If-Else If ladder for discount logic
        if (age < 5) {
            System.out.println("Free Ticket");
        } else if (age <= 12) {
            System.out.println("50% Discount");
        } else if (age >= 60) {
            System.out.println("30% Senior Citizen Discount");
        } else {
            System.out.println("No Discount");
        }
        sc.close();
    }
}
