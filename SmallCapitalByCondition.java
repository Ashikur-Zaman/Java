
package santo;

import java.util.Scanner;


public class SmallCapitalByCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char chck;
        System.out.print("Enter any letter : ");
        chck = input.next().charAt(0);
        
        if(chck>='a' && chck<='z'){
            System.out.println("The letter is "+chck);
            System.out.println("This is a small letter.");
        }
        else if(chck>='A' && chck<='Z'){
            System.out.println("The letter is "+chck);
            System.out.println("This is a Capital letter.");
        }
        else{
            System.out.println("The letter is "+chck);
            System.out.println("This is NOT a letter.");
        }
        
    }
}
