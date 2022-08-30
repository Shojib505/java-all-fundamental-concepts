package super_big;

public class motor_bike extends Vehicle{
    
    int ingin_cc;
    int sit;
    
    motor_bike(String name, String color,int ingin_cc,int sit, int wheel, int speed, int weight) {
        super(name, color, wheel, speed, weight);
        this.ingin_cc = ingin_cc;
        this.sit = sit;
        
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Ingin Meilage CC : "+ingin_cc);
        System.out.println("Maximum People can sit : "+sit+"\n");
    }
    
}
