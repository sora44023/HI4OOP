public class StonesTest {
    public static void main(String[] args) {
        System.out.println("----- (2) -----");
        Stones stones2 = new Stones(3);
        System.out.println(stones2);
        stones2.show();
        stones2.take(2);
        System.out.println(stones2);
        stones2.show();
        
        System.out.println("----- (3) -----");
        Stones stones3 = new Stones(7);
        System.out.println(stones3);
        stones3.show();
        System.out.println("2個取ります");
        System.out.println(stones3.take(2));
        stones3.show();
        System.out.println("10個取ります");
        System.out.println(stones3.take(10));
        stones3.show();        
        System.out.println("5個取ります");
        System.out.println(stones3.take(5));
        stones3.show();        
    }
}
