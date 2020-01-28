
package santo;

import java.util.Scanner;


public class MaxiMiniNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int chck;
        System.out.print("Enter any number : ");
        chck = input.nextInt();
        
        if(chck>100){
            System.out.println("The number is : "+chck);
            System.out.println("This is the maximum number from 100.");
        }
        else if(chck<100){
            System.out.println("The number is : "+chck);
            System.out.println("This is the minimum number from 100.");
            
        }
        else{
            System.out.println("The number is : "+chck);
            System.out.println("This is the equal number of 100.");
        }
    }    
}
