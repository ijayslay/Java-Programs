import java.util.Scanner;

public class combine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== SWITCH CASE MENU =====
        System.out.println("===== BANK MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Loan Eligibility");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double balance = 5000; // Example balance

        switch (choice) {
            case 1: // SIMPLE IF
                if (balance > 0) {
                    System.out.println("Your balance is: ₹" + balance);
                }
                break;

            case 2: // IF-ELSE
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    System.out.println("Withdrawal successful! Remaining balance: ₹" + (balance - amount));
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 3: // IF-ELSE IF LADDER
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                if (deposit <= 0) {
                    System.out.println("Invalid amount!");
                } else if (deposit <= 1000) {
                    System.out.println("Deposit successful (Small deposit).");
                } else if (deposit <= 5000) {
                    System.out.println("Deposit successful (Medium deposit).");
                } else {
                    System.out.println("Deposit successful (Large deposit).");
                }
                break;

            case 4: // NESTED IF
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                if (age >= 18) { // Outer if
                    System.out.print("Enter your monthly income: ");
                    double income = sc.nextDouble();
                    if (income >= 20000) { // Inner if
                        System.out.println("✅ You are eligible for a loan.");
                    } else {
                        System.out.println("❌ Your income is too low for a loan.");
                    }
                } else {
                    System.out.println("❌ You must be at least 18 years old to apply.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
