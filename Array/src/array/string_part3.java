package array;

public class string_part3 {
    public static void main(String[] args) {
        String country = "         Bangladesh Is My Country And I am a citizen of this country           ";
        System.out.println(country);
        
        String tr= country.trim();
        System.out.println("After removing spaces String is : \n "+tr);
        
        char ch= country.charAt(5);
        System.out.println("the charecter or index five is : "+ch);
        
        int asci =country.codePointAt(11);
        System.out.println("Anci Code of I is : "+asci);
        
        int pos = country.indexOf("Is");
        System.out.println("Index Number of 'Is': "+pos);
        
        pos = country.lastIndexOf("n");
        System.out.println("Last Index of 'I' is: "+pos);
        
        
    }
}
