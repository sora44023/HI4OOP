import java.time.LocalDate;

class DateTimeExceptionTest {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2013, 1, 31);
        System.out.println(date1.plusDays(40));
        System.out.println("DateTimeExceptionExceptionを発生させます．");
        LocalDate date2 = LocalDate.of(2013, 1, 32);
        System.out.println(date2.plusDays(40));
        System.out.println("Hello");
    }
}