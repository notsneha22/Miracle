package IPS1.day1;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}

