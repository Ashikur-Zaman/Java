
package santo;

import java.util.Scanner;


public class VowelTestByCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char chck;
        System.out.print("Enter any character : ");
        chck = input.next().charAt(0);
        
        if(chck=='a' || chck=='e' || chck=='i' || chck=='o' || chck=='u' || chck=='A' || chck=='E' || chck=='I' || chck=='O' || chck=='U'){
            System.out.println("The character is :"+chck);
            System.out.println("This is a vowel");
        }
        else{
            System.out.println("The character is :"+chck);
            System.out.println("This is consonant.");
        }
    }
}
