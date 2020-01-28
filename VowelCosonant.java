
package santo;

import java.util.Scanner;


public class VowelCosonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char chck;
        System.out.print("Enter any character : ");
        chck = input.next().charAt(0);
        
        switch (chck) {
            case 'a':
            case 'A':
                System.out.println("character :"+chck);
                System.out.println("This is vowel.");
                break;
            case 'e':
            case 'E':
                System.out.println("character :"+chck);
                System.out.println("This is vowel.");
                break;
            case 'i':
            case 'I':
                System.out.println("character :"+chck);
                System.out.println("This is vowel.");
                break;
            case 'o':
            case 'O':
                System.out.println("character :"+chck);
                System.out.println("This is vowel.");
                break;
            case 'u':
            case 'U':
                System.out.println("character :"+chck);
                System.out.println("This is vowel.");
                break;
            default:
                System.out.println("character :"+chck);
                System.out.println("This is consonant.");
                break;
        }
    }
    
}
