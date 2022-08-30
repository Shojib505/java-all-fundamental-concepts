package oop_after80;

public class Test_teacher {
    public static void main(String[] args) {
        
        Teachers first_teacher = new Teachers();
        
        first_teacher.name ="Mutallib Jonab";
        first_teacher.gender ="Male";
        first_teacher.age = 35;
        first_teacher.phone = 1712456788;
        
        System.out.println("Name : "+first_teacher.name);
        System.out.println("Gender : "+first_teacher.gender);
        System.out.println("Age : "+first_teacher.age);
        System.out.println("Phone : "+first_teacher.phone);
        System.out.print("\n");
        
        
        
        Teachers second_teacher = new Teachers();
        
        second_teacher.name ="Allauddin Jonab";
        second_teacher.gender ="Male";
        second_teacher.age = 40;
        second_teacher.phone = 1715487956;
        
        System.out.println("Name : "+second_teacher.name);
        System.out.println("Gender : "+second_teacher.gender);
        System.out.println("Age : "+second_teacher.age);
        System.out.println("Phone : " +second_teacher.phone);
        System.out.print("\n");
        
        
        
        Teachers third_teacher = new Teachers();
        
        third_teacher.name ="Australian Jonab";
        third_teacher.gender ="Male";
        third_teacher.age = 50;
        third_teacher.phone = 1745721547;
        
        System.out.println("Name : "+third_teacher.name);
        System.out.println("Gender : "+third_teacher.gender);
        System.out.println("Age : "+third_teacher.age);
        System.out.println("Phone : "+third_teacher.phone);
    }
}
