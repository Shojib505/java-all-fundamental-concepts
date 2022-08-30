package array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_format {
    public static void main(String[] args) {
        
        Date trik = new Date();
        
        DateFormat design = new SimpleDateFormat("dd/MM/yyyy");
        String at = design.format(trik);
        
        System.out.println("Ajker Tariq : "+at);
        
        
        
        
    }
}
