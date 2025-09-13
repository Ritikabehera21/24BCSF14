//  Q5. Write a program to check a number is odd or even.

import java.util.Scanner;

class Number {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}
