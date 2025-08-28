import java.util.Scanner;

public class combine2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Condition Examples Menu ===");
        System.out.println("1. ATM Withdrawal (Nested If)");
        System.out.println("2. Pass/Fail Result (Nested If-Else)");
        System.out.println("3. Ticket Discount (If-Else If Ladder)");
        System.out.println("4. Simple Condition Check");
        System.out.println("5. Blood Donation Eligibility (Nested If)");
        System.out.print("Choose an option (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> { // ATM Withdrawal - Nested If
                double balance = 5000;
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    System.out.print("Enter your ATM PIN: ");
                    int pin = sc.nextInt();
                    if (pin == 1234) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Incorrect PIN.");
                    }
                } else {
                    System.out.println("Insufficient balance.");
                }
            }
            case 2 -> { // Pass/Fail - Nested If-Else
                System.out.print("Enter your marks: ");
                int marks = sc.nextInt();
                if (marks >= 40) {
                    if (marks >= 75) {
                        System.out.println("Distinction");
                    } else if (marks >= 60) {
                        System.out.println("First Class");
                    } else {
                        System.out.println("Pass");
                    }
                } else {
                    System.out.println("Fail");
                }
            }
            case 3 -> { // Ticket Discount - If-Else If Ladder
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                if (age < 5) {
                    System.out.println("Free Ticket");
                } else if (age <= 12) {
                    System.out.println("50% Discount");
                } else if (age >= 60) {
                    System.out.println("30% Senior Citizen Discount");
                } else {
                    System.out.println("No Discount");
                }
            }
            case 4 -> { // Simple Condition Example
                int a = 10, b = 20;
                if (a == 10) {
                    if (b != 20) {
                        System.out.println("aths");
                    } else {
                        System.out.println("atharva kapile");
                    }
                }
            }
            case 5 -> { // Blood Donation Eligibility - Nested If
                System.out.print("Enter your age: ");
                int ageBD = sc.nextInt();
                System.out.print("Enter your weight: ");
                double weight = sc.nextDouble();
                if (ageBD >= 18) {
                    if (weight >= 50.0) {
                        System.out.println("You are eligible to donate blood.");
                    } else {
                        System.out.println("You must weigh at least 50 kilograms to donate blood.");
                    }
                } else {
                    System.out.println("You must be at least 18 years old to donate blood.");
                }
            }
            default -> System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
