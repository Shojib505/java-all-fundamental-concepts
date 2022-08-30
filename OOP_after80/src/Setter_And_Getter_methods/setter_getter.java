package Setter_And_Getter_methods;

public class setter_getter {
    private String name,education;
    private int age, sellry;
    
    
    public String getname(){
        return name;
    };
    public String setneame(String name){
        return this.name= name;
    };
    
    
    public String geteducation(){
        return education;
    };
    public String seteducation(String education){
        return this.education = education;
    };
    
    
    public int getage(){
        return age;
    };
    public int setage(int age){
        return this.age= age;
    };
    
    
    public int getsellry(){
        return sellry;
    };
    public int setsellry(int sellry){
        return this.sellry = sellry;
    };
    
    
    void method(){
        System.out.println("Name : "+name);
        System.out.println("Education : "+education);
        System.out.println("Sellry : "+sellry);
        System.out.println("Age : "+age);
        
    };
}
