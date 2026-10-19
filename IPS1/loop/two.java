package IPS1.loop;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // shorthand for sum = sum + i
        }

         System.out.println("Sum = " + sum);
    }

    
}
