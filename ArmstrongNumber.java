
package javacode3;

import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,num1,sum=0,r,m;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        System.out.print("Enter last number : ");
        num1 = input.nextInt();
        
        for (int i = num; i <=num1; i++) {
            
            m=i;
            while(m!=0){
                r=m%10;
                sum=sum+(r*r*r);
                m=m/10;
            }
            
            if(sum==i){
                System.out.println(sum+" ");
            }
            sum=0;
        }
        
            
    }
}
