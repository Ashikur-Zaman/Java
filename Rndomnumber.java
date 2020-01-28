
package javaarrray;

import java.util.Random;


public class Rndomnumber {
    public static void main(String[] args) {
        
        Random ran = new Random();
        int randomnumber = ran.nextInt(1000);
        
        System.out.println(randomnumber);
        
        int rann = (int) (Math.random()*1000);
        System.out.println("Random = "+rann);
        
    }
}
