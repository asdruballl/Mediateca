package personal_practice;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char response;
        System.out.println("Welcome to my first program on JAVA");
        System.out.println("This is a calculator");
        do {
            System.out.println("Please, input the first value: ");
            int n1 = read.nextInt();
            System.out.println("Thanks, now please input the second value: ");
            int n2 = read.nextInt();
            System.out.println("Okay, now please choose an option: ");
            System.out.println("a. Addition ");
            System.out.println("b. Subtraction ");
            System.out.println("c. Multiplication ");
            System.out.println("d. Division ");
            char option = read.next().charAt(0);
            if (option == 'a') {
                System.out.println("Result: " + (n1 + n2));
            } else if (option == 'b') {
                System.out.println("Result: " + (n1 - n2));
            } else if (option == 'c') {
                System.out.println("Result: " + (n1 * n2));
            } else if (option == 'd') {
                if (n2 == 0) {
                    System.out.println("Error! cannot divide by zero");
                } else {
                    System.out.println("Result: " + (n1 / n2));
                }
            } else {
                System.out.println("Sorry, please, try again");
            }
            System.out.println("Do you wanna try another operation?");
            System.out.println("y. Stay in the calculator");
            System.out.println("n. Exit");
            response = read.next().charAt(0);
        }
        while(response == 'y' || response == 'Y');
        System.out.println("Goodbye");
    }
}