package abstract_problem_solve;

public class circle extends shape{
    
    circle(int x){
        super(x,x);
    }
    
    @Override
    void area(){
        double ans = Math.PI * x *x ;
        System.out.println("Area Of Circle : "+ans);
        
        
    }
    
}
