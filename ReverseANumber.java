
package javacode3;

import java.util.Scanner;


public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,r,sum,rev=0;
        System.out.print("Enter any for reverse : ");
        num = input.nextInt();
        
        r=num;
        
        while(r!=0){
            sum=r%10;
            rev=rev*10+sum;
            r=r/10;
        }
        if(num==rev){
            System.out.println("This is a palindrome number.");
        }
        else{
            System.out.println("The reverse number of "+num + " is = "+rev);  
        }
        
    }
}
