package constructor;

public class Test_teachers {
    public static void main(String[] args) {
        
        Teachers teacher1 =new Teachers("Mutallib Jonab","Male",35,"Math",25000,1789546214);
        
        teacher1.detailsOfTeachers();
        
        
        Teachers teacher2 =new Teachers("Alauddin Jonab","Male",40,"Arabic",22000,1789545554);
        
        teacher2.detailsOfTeachers();
        
        
        Teachers teacher3 =new Teachers("Austreliyan Jonab","Male",50,"Math",10000,1789555544);
        
        teacher3.detailsOfTeachers();
    }
}
