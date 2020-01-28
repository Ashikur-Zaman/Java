
package santo;

import java.util.Scanner;


public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int chck;
        System.out.print("Enter any number :");
        chck = input.nextInt();
        
        if(chck%2==0){
            System.out.println("This is even number.");
        }
        else{
            System.out.println("The result is odd.");
        }
    }
}
