package array;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time_format {
    public static void main(String[] args) {

        LocalTime shomoy = LocalTime.now();

        DateTimeFormatter tm = DateTimeFormatter.ofPattern("hh.mm.ss");
        String sm = tm.format(shomoy);

        System.out.println("Time " + sm);

    }
}
