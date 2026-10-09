package cprogramming;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while ( n > 0) {
            int d = n % 10;
            rev = rev*10 + d;
            n = n / 10;

            if (temp == rev) {
                System.out.print("palindrome");
            }else {
                System.out.print("Not");
                
            }
            
        }



    }
    
}
