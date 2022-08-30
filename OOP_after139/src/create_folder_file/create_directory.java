package create_folder_file;

import java.io.File;

/**
 *
 * @author Ali_Shojib
 */
public class create_directory {
    public static void main(String[] args) {
        File di = new File("C:/Users/Ali Shojib/Desktop/Person Folder");
        di.mkdir();
        
        
        String dir = di.getAbsolutePath();
        System.out.println(dir);
        
        String name = di.getName();
        System.out.println("Name of folder : "+name);
        
        
        /*if(di.delete()){
            System.out.println(di.getName()+" has been deleted");
        }
        **/
        
        
        
        
    }
}
