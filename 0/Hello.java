import java.util.Calendar;

class Hello {
    public static void main(String[] args){
        System.out.println("Hello!");

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        System.out.println("It’s " + hour + ":" + min + " now.");
    }
}