package interface_multipule;

public class animal implements cat, dog{
    
    @Override
    public void eat(){
        System.out.println("Hello");
    }    
}
