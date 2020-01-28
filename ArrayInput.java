
package javaarrray;

import java.util.Scanner;


public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int[] number = new int[5];
        System.out.println("Enter 5 number : ");
        
        for (int i = 0; i < number.length; i++) {
            
            number[i] = input.nextInt();
        }
        
        for (int i = 0; i < number.length; i++) {
            
            sum = sum+number[i];
            
        }
        
        double maxi=number[0];
        double mini=number[0];
        
        for (int i = 0; i < number.length; i++) {
            
            if(maxi<number[i]){
                maxi = number[i];
            }
            if(mini>number[i]){
                mini = number[i];
            }
            
        }
        
        
        System.out.println("The sum of the value is = "+sum);  
        double avrg = sum / number.length;
        System.out.println("The avarage of the total value is = "+avrg);
        System.out.println("The maximum number is = "+maxi);
        System.out.println("The minimum number is = "+mini);
        
        
        
        
    }
}
