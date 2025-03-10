package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        CharSequence charSequence = new StringBuffer("12-2025-01");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        LocalDate date = LocalDate.parse(charSequence.toString(), formatter);
        System.out.println(date);

    }
}
