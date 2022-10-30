package MyCustomPackage;

import java.util.Scanner;

public class Exp6que1 {
    public static void main(String[] args) {
        Operations op = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        op.difference(a,b);
        op.division(a,b);
        op.multiply(a,b);
        op.sum(a,b);
    }
}
