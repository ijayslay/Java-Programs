import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        double[] myList = new double[n];

        // Take user input for the array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            myList[i] = scanner.nextDouble();
        }

        boolean exit = false;
        while (!exit) {
            // Menu for user to choose which block to execute
            System.out.println("Choose an option:");
            System.out.println("1. Print all elements");
            System.out.println("2. Sum all elements");
            System.out.println("3. Find the largest element");
            System.out.println("4. Find the smallest element");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Print all the array elements
                    System.out.println("Array elements:");
                    for (int i = 0; i < myList.length; i++) {
                        System.out.print(myList[i] + " ");
                    }
                    System.out.println(); // Move to the next line
                    break;

                case 2:
                    // Summing all elements
                    double total = 0;
                    for (int i = 0; i < myList.length; i++) {
                        total += myList[i];
                    }
                    System.out.println("Total is " + total);
                    break;

                case 3:
                    // Finding the largest element
                    double max = myList[0];
                    for (int i = 1; i < myList.length; i++) {
                        if (myList[i] > max) {
                            max = myList[i];
                        }
                    }
                    System.out.println("Max is " + max);
                    break;

                case 4:
                    // Finding the smallest element
                    double min = myList[0];
                    for (int i = 1; i < myList.length; i++) {
                        if (myList[i] < min) {
                            min = myList[i];
                        }
                    }
                    System.out.println("Min is " + min);
                    break;

                case 5:
                    // exit
                    exit = true;
                    System.out.println("Thank for using these program!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
        scanner.close(); // Close the scanner
    }
}
