package parametrized_method;

public class Teachers {
    String name,gender,sub;
    int age,sellary,phone;
    
    void setInformation(String n, String g, int ag,String su, int sella, int ph ){
        name= n;
        gender=g;
        age= ag;
        sub=su;
        sellary=sella;
        phone=ph;
    }
    
    
    void detailsOfTeachers(){
        System.out.println("Name    : "+name);
        System.out.println("Gender  : "+gender);
        System.out.println("Age     : "+age);
        System.out.println("Subject : "+sub);
        System.out.println("Sellary : "+sellary);
        System.out.println("Phone   : "+phone);
        System.out.println("");
    }
    
}
