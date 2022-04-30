class BarTest1{
    public static void main(String[] args){
        System.out.println("Example 1:");
        Bar b1 = new Bar();
        b1.len = 4;
        b1.pattern = '#';
        b1.draw(false);

        System.out.println("Example 2:");
        Bar b2 = new Bar();
        b2.len = 3;
        b2.pattern = 'A';
        b2.draw(true);
    
    }
}