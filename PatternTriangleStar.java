
package javacode3;

import java.util.Scanner;


public class PatternTriangleStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        for (int row = 1; row <= num; row++) {
            
            for (int col = 1; col <= num; col++) {
                
                if(col==1 || row==num || col==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    
                }
                
                
            }
            System.out.println(" ");
            
        }
        
    }  
}
