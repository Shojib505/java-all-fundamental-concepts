package overloding_constructor;

public class Test_teachers {
    public static void main(String[] args) {
        
        Teachers teacher1 =new Teachers("Mutallib Jonab","Male",35,"Math",25000,1789546214);
        
        teacher1.detailsOfTeachers();
        
        
        Teachers teacher2 =new Teachers("Alauddin Jonab","Arabic",40);
        
        teacher2.detailsOfTeachers();
        
        
        Teachers teacher3 =new Teachers();
        
        teacher3.detailsOfTeachers();
    }
}
