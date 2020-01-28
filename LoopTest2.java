
package javaloop;

import java.util.Scanner;


public class LoopTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m , n , sum = 0;
        
        System.out.print("Enter the first value : ");
        m = input.nextInt();
        
        System.out.print("Enter the last value : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i = i+1) {
            
            sum = sum + (i*i);
            System.out.print(i);
            System.out.print("*");
            System.out.print(i);
            if(i!=n){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
}
