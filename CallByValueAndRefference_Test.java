
package java_oop;


public class CallByValueAndRefference_Test {
    public static void main(String[] args) {
        
        CallByValueAndRefference ob = new CallByValueAndRefference();
        
        ob.name = "tom";
        System.out.println("x  = "+ob.name);
        
        ob.change(ob);
        System.out.println("After x = "+ob.name);
        
        
    }
}
