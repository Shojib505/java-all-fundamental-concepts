package recursion;

public class recursion {

    int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
            /*
             * 5* (5-1{ 4*{4-1{3*{3-1{2*{2-1///{1=1}}}}}}}) *
             * 5* 4 * 3 * 2 * 1 * 1
             * 36*3 36 12 4 2
             */
        }
    };
}
