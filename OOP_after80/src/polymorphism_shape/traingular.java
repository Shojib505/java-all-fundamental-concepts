package polymorphism_shape;

public class traingular extends shape{
    
    double base;
    double height;

    public traingular(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    
    
    @Override
    double area(){
        System.out.print("Area Of Traingular : ");
        return 0.5*base*height;
    }
            
    
}
