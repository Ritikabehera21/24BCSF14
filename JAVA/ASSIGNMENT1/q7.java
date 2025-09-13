//  Q7. Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%).

import java.util.Scanner;
class Time {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        System.out.println(hours + " hours: " + minutes + " minutes: " + seconds + " seconds");
    }
}
