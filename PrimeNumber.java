
package javaloop;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int min,max,totalprime=0;
        int count = 0;
        
        System.out.print("Enter any number for check the prime : ");
        min = input.nextInt();
        
        System.out.print("Enter the final number from check the prime : ");
        max = input.nextInt();
        
        System.out.println("The prime number's are :");
        
        for (int i=min; i<=max; i++) {
            
            for (int j = 2; j<i; j++) {
                
                if(i%j==0){
                    count++;
                    break;
                }
            }
        

            if(count==0){
            
               System.out.println(i);
               totalprime++;
            }
            count=0;
        }
        System.out.println("The total prime number is = "+totalprime);
    }
}
