package IPS1.day6;
import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");

        int n = sc.nextInt();

        for (int floor = 1; floor < n+1; floor++) {
            System.out.println(floor);
        }

        sc.close();
    }
}