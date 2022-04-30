class NumberFormatExceptionTest {
    public static void main(String[] args){
        String s1 = "123";
        String s2 = "abc";
        int x1 = Integer.parseInt(s1);
        System.out.println(x1*10);
        System.out.println("NumberFormatExceptionを発生させます．");
        int x2 = Integer.parseInt(s2);
        System.out.println(x2*10);
        System.out.println("Hello");
    }
}