/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ali_Shojib
 */
public class read {
    public static void main(String[] args) {
        try{
        File file = new File("Person Folder/students.txt");
        Scanner show = new Scanner(file);
        
        while(show.hasNext()){
            
            String id = show.next();
            String name = show.next();
            System.out.println("ID : "+id+ "  Name : "+name);
            
        }
        
        show.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
