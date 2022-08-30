package array;

public class Wapper_class {

    public static void main(String[] args) {

        // primitive to object
        int number = 50;
        Integer num = Integer.valueOf(number); // wapper class
        System.out.println("NUMBER :" + num);

        Integer num1 = number; // auto boxing
        System.out.println("number auto box :" + num1);

        // object to primitive

        Double bejur = 20.54;

        double be = Double.valueOf(bejur); // wapper class
        System.out.println("Odd Number : " + be);

        double be1 = bejur; // unoboxing
        System.out.println("Unbox Odd : " + be1);

    }
}
