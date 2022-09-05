package pkg1;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Divison");
        System.out.println("Enter the choice- ");
        int ch = sc.nextInt();
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.print("Enter second number- ");
        int b = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition is "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction is "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is "+(a*b));
                break;
            case 4:
                System.out.println("Divison is "+(a/b));
                break;
        }
        sc.close();
    }
}