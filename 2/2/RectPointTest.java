class RectPointTest{
    public static void main(String[] args){
        RectPoint rp1 = new RectPoint(2,3);
        // System.out.println("x: "+rp1.x); // これはコンパイルエラーになる
        System.out.println("x: "+rp1.getX());
        System.out.println("y: "+rp1.getY());
        System.out.println("quad: "+rp1.getQuad());

        System.out.println("---");
        RectPoint rp2 = new RectPoint(0, 1);
        System.out.println("x: "+rp2.getX());
        System.out.println("y: "+rp2.getY());
        System.out.println("quad: "+rp2.getQuad());

        System.out.println("---");
        RectPoint rp3 = new RectPoint(-1, -5);
        System.out.println("quad: "+rp3.getQuad());

        System.out.println("---");
        RectPoint rp4 = new RectPoint(2, 3);
        System.out.println(rp4.isSameAs(rp1));
        System.out.println(rp4.isSameAs(rp2));
    }
}