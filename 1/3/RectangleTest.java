class RectangleTest {
    public static void main(String[] args){
        System.out.println("--- r1 ---");
        Rectangle r1 = new Rectangle();
        r1.height = 5;
        r1.width = 4;
        System.out.println("Area: " + r1.getArea());
        r1.draw(true);

        System.out.println("--- r2 ---");
        Rectangle r2 = new Rectangle();
        r2.height = 3;
        r2.width = 20;
        System.out.println("Area: " + r2.getArea());
        r2.draw(false);
    }
}