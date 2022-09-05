import java.util.*;
public class OddEvenCondition {
    public static void main (String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

    }
}
