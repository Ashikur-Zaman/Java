
package santo;

import java.util.Scanner;


public class CapitalSmaller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char chck;
        System.out.print("Enter any character : ");
        chck = input.next().charAt(0);
        
        switch(chck){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("The letter is : "+chck);
                System.out.println("This is a smaller letter.");
                break;
            
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("The letter is : "+chck);
                System.out.println("This is a capital letter.");
                break;
            default:
                System.out.println("The letter is : "+chck);
                System.out.println("This is not a letter.");
                
                
                
          
                
        }
        
    }
}
