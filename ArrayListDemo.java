
package javaarrray;

import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("Array size : "+number.size());
        
        number.add(10);
        number.add(20);
        number.add(2,30);
        number.add(40);
        
        System.out.println("Array are : ");
        for(int x:number){
            System.out.print(" "+x);
        }
    
        
        System.out.println(" ");
        System.out.println("Array size : "+number.size());
       

        boolean b = number.contains(30);
        System.out.println(" b= "+b);
        
        int i = number.indexOf(40);
        System.out.println(" idex = "+i);
        
        number.set(0, 100);
        int k = number.get(0);

        System.out.println(" array = "+number);
        
        
        number.remove(2);
        System.out.print(" "+number);
        System.out.println(" ");
        
        number.clear();
        System.out.println(" clear = "+number);
        
        boolean is = number.isEmpty();
        System.out.println(" Is empty = "+is);
       
    }
}
