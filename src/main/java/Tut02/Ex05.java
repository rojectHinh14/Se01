package Tut02;

import java.util.Scanner;

public class Ex05 {
    public static void divide(int[] a, int[] b) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            try {
                a[i] /= b[i];  // Perform the division

            } catch (IndexOutOfBoundsException e) {
                // Handle missing elements in array b
                System.out.println("Array b is too short; please input more value or type 'quit' to exit:");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting...");
                    return;
                }

                try {
                    int newValue = Integer.parseInt(input);
                    b = extendArr(b, newValue);  // Update array b correctly
                    i--;  // Re-attempt current index after extending the array
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid input, please enter a valid integer or 'quit'.");
                }



            } catch (ArithmeticException e) {
                System.out.println("Division by zero encountered at b[" + i + "]. Please provide a new non-zero value for b[" + i + "], or type 'quit' to exit:");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting...");
                    return;
                }

                try {
                    int newValue = Integer.parseInt(input);
                    b[i] = newValue;
                    i--;
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid value; please enter a integer or quit");
                }
            }
        }
    }


    public static int[] extendArr(int[] arr, int newValue) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = newValue;
        return newArr;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {2}; // Example to trigger IndexOutOfBoundsException

        divide(a, b);  // Test the divide method
    }

}
