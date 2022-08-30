package variable_lenth_argument;

public class variable_length {
    void method(int ... num1 ){
        int sum =0;
        for ( int num : num1) {
            sum = sum + num;
            
        }
        System.out.println("Sum of two is : "+sum);
    };
}
