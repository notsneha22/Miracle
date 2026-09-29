package IPS1.day1;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        // Loop from n down to 1
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);   // last number without comma
            } else {
                System.out.print(i + ",");
            }
        }

        sc.close();

    }
}
    

 
    

