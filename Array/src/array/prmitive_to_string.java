package array;

public class prmitive_to_string {
    public static void main(String[] args) {
        
        int x = 55;
        String sb = Integer.toString(x);
        System.out.println(sb);  //prmitive int to string 
        
        double x1 = 55.00;
        String sb1 = Double.toString(x1);
        System.out.println(sb1);  //prmitive double to string 
        
        boolean x2 = true;
        String sb2 = Boolean.toString(x2);
        System.out.println(sb2);  //prmitive boolean to string 
        
        
        
        
        
        String xx= "32";
        int in = Integer.parseInt(xx);
        System.out.println("First name in integer :  "+in); // string convert into int
   
        String xx1= "50.00";
        double in1 = Double.parseDouble(xx1);
        System.out.println("First name in double :  "+in1); // string convert into double
        
        String xx2= "32";
        
        boolean in2 = Boolean.parseBoolean(xx2);
        System.out.println("First name in boolean :  "+in2); // string convert into boolean
        
   }
}
