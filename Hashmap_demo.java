
package java_linklist;

import java.util.HashMap;


public class Hashmap_demo {
    public static void main(String[] args) {
        
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        
        customer.put(101, "rahim");
        customer.put(102, "korim");
        customer.put(103, "momin");
        
        System.out.println(customer.get(102));
    }
}
