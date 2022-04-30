class BarTest2{
    public static void main(String[] args){
        System.out.println("Example 3: ");
        Bar b3 = new Bar();
        b3.draw(false);

        System.out.println("Example 4: ");
        Bar b4 = new Bar(4, '@');
        b4.draw();
        b4.draw(true);
        b4.draw(3);
    }
}