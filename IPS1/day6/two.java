package IPS1.day6;
import java.util.Scanner;
public class two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");

        int n = sc.nextInt();

        for (int seat = 2; seat <= n; seat += 2) {
            System.out.println(seat + " ");
        }
        
    }
    
}
