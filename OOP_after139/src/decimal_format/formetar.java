/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_format;

import java.text.DecimalFormat;

/**
 *
 * @author Ali_Shojib
 */
public class formetar {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");

        //float xy = 2.573f;
        //System.out.printf("xy = %.2f",xy);
        
        double xy = 2.56283;
        System.out.println("XY = "+format.format(xy));
        
    }
    
}
