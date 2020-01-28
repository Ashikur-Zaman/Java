
package javaarrray;


public class ForEachLoop {
    public static void main(String[] args) {
        
        String[] about = {"Ashikur","Jaman","Santo","vakbi"};
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        
        for(String x: about){
            System.out.println(x);
            
        }
        
        //2nd part
        
        int sum= 0;
        
        for(int y: num){
            sum=sum + y;
            System.out.println(y);
        }
        System.out.println("sum = "+sum);
    }
}
