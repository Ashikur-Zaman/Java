
package javacode3;

import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int first=0,second=1,fibo,n;
        System.out.print("Enter nedded fibonacci number : ");
        n = input.nextInt();
        
        System.out.println("The fibonacci number's are :");
        System.out.print(first+" "+second);
        
        for (int i = 3; i <= n; i++) {
            
            fibo = first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
            
        }
        System.out.println("\n");
    }
}
