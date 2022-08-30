package instance_variable_hiding;

public class Box {
    
    double height,width,depth;
    
    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        
    };
    
    void displayvol(){
        double vol = height*width*depth;
        System.out.println("Volume is : "+vol);
    }
    
    
    
}
