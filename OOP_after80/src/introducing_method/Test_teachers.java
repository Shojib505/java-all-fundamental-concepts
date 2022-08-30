package introducing_method;

public class Test_teachers {
    public static void main(String[] args) {
        
        Teachers teacher1 =new Teachers();
        
        teacher1.name ="Mutallib Jonab";
        teacher1.gender="Male";
        teacher1.age=35;
        teacher1.sub="Math";
        teacher1.sellary=25000;
        teacher1.phone=1789546214;
        
        teacher1.detailsOfTeachers();
        
        
        Teachers teacher2 =new Teachers();
        
        teacher2.name ="Alauddin Jonab";
        teacher2.gender="Male";
        teacher2.age=40;
        teacher2.sub="Arabic";
        teacher2.sellary=22000;
        teacher2.phone=1789545554;
        
        teacher2.detailsOfTeachers();
        
        
        Teachers teacher3 =new Teachers();
        
        teacher3.name ="Austreliyan Jonab";
        teacher3.gender="Male";
        teacher3.age=50;
        teacher3.sub="Math";
        teacher3.sellary=10000;
        teacher3.phone=1789555544;
        
        teacher3.detailsOfTeachers();
    }
}
