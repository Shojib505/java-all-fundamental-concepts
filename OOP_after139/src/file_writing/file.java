package file_writing;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Ali_Shojib
 */
public class file {

    public static void main(String[] args) {
        int id, st_num;
        String name;

        try {

            Formatter formatt = new Formatter("Person Folder/students.txt");

            Scanner input = new Scanner(System.in);

            System.out.print("How many student numeber you want to input : ");
            st_num = input.nextInt();

            for (int i = 0; i < st_num; i++) {
                System.out.print("Enter students id & name : ");
                id = input.nextInt();
                name = input.nextLine();

                formatt.format("%s %s \r\n", id, name);

            }
            
            formatt.close();

            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
