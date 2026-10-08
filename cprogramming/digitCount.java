package cprogramming;
import java.util.Scanner;
public class digitCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        int n = sc.nextInt();

        int count = 0;

        if ( n == 0) {
            count = 1;

        } else {
            while ( n > 0 ) {
                count++;
                n = n / 10;

            }
        }
        System.out.println(count);
        
    }
}
