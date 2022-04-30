public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello, Java";
        String s2 = "!!!";
        String ans8 = "";

        System.out.println("(1): "+ s1.charAt(1));
        System.out.println("(2): "+ s1.length());
        System.out.println("(3): "+ s1.endsWith("Java"));
        System.out.println("(4): "+ s1.indexOf("o"));
        System.out.println("(5): "+ s1.lastIndexOf("a"));
        System.out.println("(6): "+ s1.substring(2,5));
        System.out.println("(7): "+ s1.toUpperCase());
        if (s1.equals(s2)) {
            ans8 = "match";
        } else {
            ans8 = "mismatch";
        }
        System.out.println("(8): "+ ans8);
        System.out.println("(9): "+ s1.concat(s2));
    }
}