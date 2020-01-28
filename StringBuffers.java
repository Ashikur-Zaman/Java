
package javaarrray;


public class StringBuffers {
    public static void main(String[] args) {
        
        String s = "Ashikur";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb);
        
        sb.append(" Zaman");
        System.out.println(sb);
        sb.append(" Santo 95");
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        
        sb.delete(0, 5);
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
        
        String sss = "madam";
        StringBuilder pal = new StringBuilder(sss);
        String rev = pal.reverse().toString();
        if(sss.equals(rev)){
            System.out.println("This is palindrom.");
        }
        else{
            System.out.println("This is not palindrom.");
        }
        
    }    
}
