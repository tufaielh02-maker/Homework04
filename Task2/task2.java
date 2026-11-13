///
package Task2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class task2 {
    public static long daysBetween(int year_from, int month_from, int day_from,
                                   int year_to, int month_to, int day_to) {
        LocalDate from = LocalDate.of(year_from, month_from, day_from);
        LocalDate to = LocalDate.of(year_to, month_to, day_to);
        return ChronoUnit.DAYS.between(from, to);
    }

    public static void main(String[] args) {
        System.out.println(daysBetween(2026, 11, 1, 2026, 11, 14));
    }
}