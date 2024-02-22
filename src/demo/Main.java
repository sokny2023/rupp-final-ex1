package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you to input: ");
        int n = scanner.nextInt();
        int [] numbers =  new int[n];

        // input number
        for (int i = 0; i < n; i++) {
            System.out.print("Input number["+(i+1)+"]: ");
            numbers[i] = scanner.nextInt();
        }

        // Display all input numbers
        System.out.println("You have entered:");
        for (int number : numbers) {
            System.out.print(number+", "+"\b");
        }

        scanner.close();
    }
}
