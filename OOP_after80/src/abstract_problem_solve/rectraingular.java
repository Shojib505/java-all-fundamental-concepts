package abstract_problem_solve;

public class rectraingular extends shape{
    
    rectraingular(int x ,int y){
        super(x,y);
    }
    
    @Override
    void area(){
        double ans = x*y;
        System.out.println("Area Of Rectaingular : "+ans);
        
        
    }
    
}
