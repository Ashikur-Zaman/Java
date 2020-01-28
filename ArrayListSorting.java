
package javaarrray;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSorting {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(10);
        number.add(20);
        number.add(2,30);
        number.add(40);
        number.add(-49);
        number.add(0);
        number.add(330);
        number.add(-80);
        number.add(-480);
        
        Collections.sort(number);
        System.out.println("Ascending = "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Descending = "+number);
        
    }
}
