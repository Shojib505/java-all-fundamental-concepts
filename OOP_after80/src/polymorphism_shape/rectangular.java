package polymorphism_shape;

public class rectangular extends shape {
    double length;
    double width;

    public rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    
    @Override
    double area(){
        System.out.print("Area Of Ractangular : ");
        return length*width;
    }
    
}
