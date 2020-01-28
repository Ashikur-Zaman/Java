
package javacode3;

import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                
                System.out.print(" "+col);
                
            }
            System.out.println("");
            
        }
        
    }
}
