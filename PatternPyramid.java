
package javacode3;

import java.util.Scanner;


public class PatternPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <=num-row; col++) {
                System.out.print("  ");
                
            }
            for (int col = 1; col <= 2*row-1; col++) {
                
                System.out.print(" "+row);
                
            }
            System.out.println(" ");
        }
        
    }    
}
    
