package problem_solve1;

public class Box {
    
    double height,width,depth;
    
    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
        
    };
    
    void displayvol(){
        double vol = height*width*depth;
        System.out.println("Volume is : "+vol);
    }
    
    
    
}
