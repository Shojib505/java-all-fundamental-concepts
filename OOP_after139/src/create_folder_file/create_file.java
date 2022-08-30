package create_folder_file;

import java.io.File;

/**
 *
 * @author Ali_Shojib
 */
public class create_file {

    public static void main(String[] args) {

        File file1 = new File("C:/Users/Ali Shojib/Documents/NetBeansProjects/OOP_after139/Person Folder/students.txt");
        File file2 = new File("C:/Users/Ali Shojib/Documents/NetBeansProjects/OOP_after139/Person Folder/teachers.txt");
        try {

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File is created");

        } catch (Exception e) {
            System.out.println(e);
        }
        //file1.delete();
        if (file1.exists()) {
            System.out.println(file1.getName() + " file is exists");
        } else {
            System.out.println(file1.getName() + " file has been deleted");
        }

    }
}
