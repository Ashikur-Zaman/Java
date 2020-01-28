
package javaloop;

import java.util.Scanner;


public class LoopTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n;
        
        System.out.print("Enter first value : ");
        m = input.nextInt();
        System.out.print("Enter second value : ");
        n = input.nextInt();
        
        
        int sum = 0;
        
        for(int i=m; i<=n; i++){
            
            if(i%2==0){
               sum = sum + i;
                System.out.println("The value is : "+i);
            }
            
        }
        System.out.println("The sum is = "+sum);
    }
}
