
package santo;

import java.util.Scanner;


public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int chck;
        System.out.print("Enter any number : ");
        chck = input.nextInt();
        
        if(chck <= 100 && chck >=80){
            System.out.println("The result is A+");
        }
        else if(chck <= 79 && chck >=70){
            System.out.println("The result is A");
         }
        else if(chck <= 69 && chck >=60){
            System.out.println("The result is A-");
        }
        else if(chck <= 59 && chck >=50){
            System.out.println("The result is B");
        }
        else if(chck <= 49 && chck >=40){
            System.out.println("The result is c");
        }
        else if(chck <= 39 && chck >= 00 ){
            System.out.println("The result is fail.");
        }
        else{
            System.out.println("Result not found.");
        }
    }
}
