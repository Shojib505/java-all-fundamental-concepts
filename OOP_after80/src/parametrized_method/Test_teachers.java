package parametrized_method;

public class Test_teachers {
    public static void main(String[] args) {
        
        Teachers teacher1 =new Teachers();
        
        teacher1.setInformation("Mutallib Jonab","Male",35,"Math",25000,1789546214);
        
        teacher1.detailsOfTeachers();
        
        
        Teachers teacher2 =new Teachers();
        
        teacher2.setInformation("Alauddin Jonab","Male",40,"Arabic",22000,1789545554);
        
        teacher2.detailsOfTeachers();
        
        
        Teachers teacher3 =new Teachers();
        
        teacher3.setInformation("Austreliyan Jonab","Male",50,"Math",10000,1789555544);
        
        teacher3.detailsOfTeachers();
    }
}
