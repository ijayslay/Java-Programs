import java.util.Scanner;

class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking marks as input
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Nested if-else logic
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
        sc.close();
    }
}
