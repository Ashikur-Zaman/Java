
package santo;

import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int chck;
        System.out.print("Enter any year : ");
        chck = input.nextInt();
        
        if((chck%4==0 && chck%100!=0) || chck%400==0){
            System.out.println("The year is : "+chck);
            System.out.println("This is a leap-year");
        }
        else{
            System.out.println("The year is : "+chck);
            System.out.println("This is not a leap-year.");
        }
        
    }
}
