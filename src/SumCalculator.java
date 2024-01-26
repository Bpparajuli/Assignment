/*Write a program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 943, the sum of all its digit is 16.
 */
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("Welcome to Sum Calculator ");
        System.out.println("**************************");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number between 0 to 1000 :  ");
        int number = Scanner.nextInt();
        System.out.println("!!!! wait for the result !!!!!");
        int firstDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;

        int thirdDigit = number % 10;
        number /= 10;

        int sum=firstDigit+secondDigit+thirdDigit;
        System.out.println("The sum of digits you entered is "+ sum);
        System.out.println("Thank you for using my calculator");
    }
}