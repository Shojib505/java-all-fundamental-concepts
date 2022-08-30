package biggenar_java_50_100;

public class Book_bear {

    public static void main(String[] args) {

        int beer_number = 99;
        String word = "bottles";

        while (beer_number > 0) {
            
            
            System.out.println(beer_number+" "+word+" Of Beer On The Wall In New Order");
            System.out.println(beer_number+" "+word+" of beer");
            System.out.println("Take one Dwon");
            System.out.println("pass it around");
            beer_number--;
            
            if (beer_number>0) {
                if (beer_number == 1) {
                    word="bottle";
                }
                System.out.println(beer_number+" "+word+" of beer on the wall at the end \n");
            }else{
                System.out.println("There is no beer on the wall ");
            }         
        }                 
    }
}
