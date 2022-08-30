package inheritance;

public class teachers extends person {
    String qualification;
    int experience;
    
    
    void method2(){
        method1();
        System.out.println("Qulification : "+qualification);
        System.out.println("Experience years "+experience);
    };
    
}
