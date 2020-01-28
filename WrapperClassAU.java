
package javaarrray;


public class WrapperClassAU {
    public static void main(String[] args) {
        
        int x = 10;
        
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+y);
        
        Integer z = x;
        System.out.println("z = "+z);
        
        Double d = new Double("20.22");
        
        double dl = d.doubleValue();
        System.out.println("dl = "+dl);
        
        double dk = d;
        System.out.println("dk = "+dl);
        
        
        
    }
}
