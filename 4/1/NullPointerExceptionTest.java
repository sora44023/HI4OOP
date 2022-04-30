class NullPointerExceptionTest {
    public static void main(String[] args){
        String s1 = "123";
        String s2 = null;
        System.out.println(s1.length());
        System.out.println("NullPointerExceptionを発生させます．");
        System.out.println(s2.length());
        System.out.println("Hello");
    }
}