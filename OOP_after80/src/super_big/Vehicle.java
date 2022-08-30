package super_big;

public class Vehicle {
    String color;
    String name;
    int wheel;
    int speed;
    int weight;

    public Vehicle(String name, String color, int wheel, int speed, int weight) {
        
        this.name = name;
        this.color = color;
        this.wheel = wheel;
        this.speed = speed;
        this.weight = weight;
    }

    
    
    
    
    void display(){
        
        System.out.println("Vehicle Name : "+name);
        System.out.println("Color : "+color);
        System.out.println("Numbers of Wheel : "+wheel);
        System.out.println("Speed per hour in km :"+speed);
        System.out.println("Weight of vehicle kg : "+weight);
    }
    
            
    
}
