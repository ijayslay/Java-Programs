import java.util.Scanner;

class nestedIfATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000; // Fixed account balance

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) { // Outer if - has enough balance
            System.out.print("Enter your ATM PIN: ");
            int pin = sc.nextInt();

            if (pin == 1234) { // Nested if - correct PIN
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Incorrect PIN.");
            }
        } else {
            System.out.println("Insufficient balance.");
        }
        sc.close();
    }
}
