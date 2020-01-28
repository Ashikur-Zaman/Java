
package javaloop;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,sum=1;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        for (int i = num; i>=1; i--) {
            
            sum=sum*i;
            System.out.print(i);
            
            if(i!=1){
               System.out.print(" X "); 
            }
        }
               
        System.out.print("\n");
        System.out.println("The factorial of "+num +" is = "+sum);
        
    }
}
