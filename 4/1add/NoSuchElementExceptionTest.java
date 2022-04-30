import java.util.*;

class NoSuchElementExceptionTest {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("two");
        Iterator it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("NoSuchElementExceptionを発生させます．");
        System.out.println(it.next());
        System.out.println("Hello");
    }
}