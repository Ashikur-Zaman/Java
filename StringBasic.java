
package javaarrray;


public class StringBasic {
    public static void main(String[] args) {
        
        String s="Santo";
        String s1 =new String("santo");
        String s2 = "Ashikur Zaman ";
        
        
        System.out.println("s = "+s);
        System.out.println("s1 = "+s1);
        
        int len = s.length();
        System.out.println("Length = "+len);
        
        boolean eql = s.equals(s1);
        System.out.println("Equals = "+eql);
        
        boolean con = s1.contains(s);
        System.out.println("Contains = "+con);
        
        boolean conig = s.equalsIgnoreCase(s1);
        System.out.println("ContainsIgnoreCase = "+conig);
        
        boolean ept = s.isEmpty();
        System.out.println("Enpty = "+ept);
        System.out.println("\n");
        
        String fullname = s2.concat(s1);
        System.out.println("Full Name = "+fullname);
        
        String up = fullname.toUpperCase();
        System.out.println("Uppar Case = "+up);
        
        String low = fullname.toLowerCase();
        System.out.println("Lower Case = "+low);
        
        boolean st = s1.startsWith("s");
        System.out.println("Start with 's' = "+st);
        
        boolean end = s.endsWith("k");
        System.out.println("End with 'k' = "+end);
        System.out.println("\n");
        
        String[] names = {"Ashikur ","Zaman ","Santo"};
        for (String x : names) {
            System.out.print(x);    
        }
        System.out.println("");
        
        char ch=s2.charAt(0);
        System.out.println("Charactar of 0 in string 's' is = "+ch);
        
        int value = s2.codePointAt(0);
        System.out.println("Code point = "+value);
        
        int ss = s2.indexOf('a');
        System.out.println("Index of a = "+ss);
        
        int ls = s2.lastIndexOf('a');
        System.out.println("Last index of a = "+ls);
        
        String[] spt = s2.split(" ");
        for (String sp: spt) {
            System.out.println(sp);
        }
        
        String rep = s2.replaceAll("Zaman", "Santo");
        System.out.println("Replace = "+rep);
        
    }
}
