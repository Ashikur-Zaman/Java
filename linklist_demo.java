
package java_linklist;

import java.util.LinkedList;


public class linklist_demo {
    public static void main(String[] args) {
        
        LinkedList<String> countrynames = new LinkedList<String>();
        
        countrynames.add("Bangladesh");
        countrynames.add("India");
        countrynames.add("Pakistan");
        countrynames.add("Nepal");
        countrynames.add(4,"Bhutan");
        
        
        for(String country : countrynames){
            
            System.out.println(country);
            
        }
        
        System.out.println("Array size of the list : "+countrynames.size());
        
        
        
    }
}
