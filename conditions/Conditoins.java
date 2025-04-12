package conditions;

import java.util.Scanner;

public class Conditoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Enter a number : ");
        a = input.nextInt();

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }
        } else if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        char c;
        System.out.println("Enter a character : ");
        c = input.next().charAt(0); // read a character from the user

        switch (c) { // Convert character to lowercase for simplicity
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                System.out.println("Vowel");
                break;
            }
            default: {
                System.out.println("Consonant");
                break;
            }
        }

    }
}