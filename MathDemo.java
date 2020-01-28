
package santo;


public class MathDemo {
    public static void main(String[] args) {
        
        int x = 3;
        int y = 5;
        
        int max = Math.max(x, y);
        System.out.println("Maximum "+max);
        
        int min = Math.min(x, y);
        System.out.println("Minimum "+min);
        
        double power = Math.pow(x, y);
        System.out.println("Power "+power);
        
        int absulate = Math.abs(y);
        System.out.println("Absulate of y is "+absulate);
        
        double pi = Math.PI;
        System.out.println("The value of pi is "+pi);
        
        int round = Math.round(89.37f);
        System.out.println("The round of "+round);
        
        System.out.println(Math.sqrt(400));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.floor(5.9));
        
    }
    
}
