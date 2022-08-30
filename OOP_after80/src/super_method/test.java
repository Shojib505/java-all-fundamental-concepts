package super_method;

public class test {
    public static void main(String[] args) {
        sub_method sm = new sub_method();
        
        sm.co_name = "BSRM extrem";
        sm.month = "January";
        sm.profit = 550000;
        
        sm.supermethod();
    }
}
