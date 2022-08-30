package abstract_problem_solve;

public class traingular extends shape{
    
    traingular(int x, int y){
        super(x,y);
        
    }
    
    @Override
    void area(){
        double ans = 0.5 * x * y;
        System.out.println("Area Of Traingular : "+ans);
    }
    
}
