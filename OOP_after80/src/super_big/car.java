package super_big;

public class car extends Vehicle{
    
    int gear;
    int sit;
    
    car(String name, String color, int sit,int gear, int wheel, int speed, int weight){
        super(name,color,wheel,speed,weight);
        this.gear = gear;
        this.sit = sit;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Gear Number : "+gear);
        System.out.println("Sit number in car :"+sit+"\n");
    }
    
    
}
