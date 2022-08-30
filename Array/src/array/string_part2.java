package array;

public class string_part2 {

    public static void main(String[] args) {

        String firstName = "Muhammad";
        String middeleName = " Ali";
        String lastName = " Sojib";

        String fullName = firstName + middeleName + lastName;
        System.out.println("Full Nmae Is : " + fullName);

        String fullName1 = firstName.concat(middeleName).concat(lastName);
        System.out.println("Full name :" + fullName1);

        String upc = fullName.toUpperCase();
        System.out.println("After All Upper Case : " + upc);

        String lowc = fullName.toLowerCase();
        System.out.println("After All Lower Case : " + lowc);

        boolean start = firstName.startsWith("Mu");
        System.out.println("Is First Nmae Start With M : " + start);

        boolean end = lastName.endsWith("b");
        System.out.println("Is Last Name End With b :" + end);

        String[] name = { "Rahim", "Korim", "Rhima", "Jobbar" };
        for (int i = 0; i < 4; i++) {
            System.out.println(name[i]);
        }

    }

}
