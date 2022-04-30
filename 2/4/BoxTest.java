class BoxTest{
    public static void main(String[] args){
        Box box1 = new Box();
        box1.draw();
        System.out.println("--------");
        Box box2 = new Box(3,5);
        box2.draw();
    }
}