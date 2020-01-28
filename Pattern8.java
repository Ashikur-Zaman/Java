
package javacode3;

import java.util.Scanner;


public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,count=0;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= row; col++) {
                
                System.out.print( ++count+" " );
                
            }
            System.out.println(" ");
            
        }
        
    }  
}
