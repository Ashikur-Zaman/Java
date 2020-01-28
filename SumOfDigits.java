
package javacode3;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,sum=0,tem,r;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        tem=num;
        while(tem!=0){
            r=tem%10;
            sum=sum+r;
            tem=tem/10;
            
        }
        System.out.println("The sum of the digits is = "+sum);
    }
}
