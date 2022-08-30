package super_big;

public class truck extends Vehicle{
    int lod;
    int gps;

    truck(String name, String color,int lod,int gps, int wheel, int speed, int weight) {
        super(name, color, wheel, speed, weight);
        this.lod = lod;
        this.gps = gps;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Meximum lod in toon : "+lod);
        System.out.println("GPS : "+gps);
    
    }
    
}
