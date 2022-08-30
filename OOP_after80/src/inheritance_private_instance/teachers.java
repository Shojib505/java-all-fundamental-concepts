/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_private_instance;

/**
 *
 * @author Ali_Shojib
 */
public class teachers extends person{
    
    private String qulai;
    private int sellry;

    public String getQulai() {
        return qulai;
    }

    public void setQulai(String qulai) {
        this.qulai = qulai;
    }

    public int getSellry() {
        return sellry;
    }

    public void setSellry(int sellry) {
        this.sellry = sellry;
    }
    
    
    void display(){
        
            System.out.println("Name : "+getName());
            System.out.println("Education : "+getEdu());
            System.out.println("Sellry : "+getSellry());
            System.out.println("Age : "+getAge());
            System.out.println("Qualitiy : "+getQulai());
            System.out.println("");
    };
    
}
