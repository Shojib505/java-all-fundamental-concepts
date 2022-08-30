package super_big;

public class test {
    public static void main(String[] args) {
        car car = new car("BMW Car","Red",4,5,4,300,350);
        car.display();
        motor_bike moto = new motor_bike("Yamaha Bike","Black",200,2,2,400,200);
        moto.display();
        truck truck = new truck("Bazaz Truck","Green",2,0,8,150,1500);
        truck.display();
        
    }
}
