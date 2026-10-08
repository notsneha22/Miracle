package cprogramming;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Enter n");

       int fact = 1;

       for(int i = 0; i < n; i++) {
        fact = fact * i;
       }
       System.out.println(fact);
       sc.close();

    }
}