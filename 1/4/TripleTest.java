class TripleTest {
    public static void main(String[] args){
        // set
        Triple t1 = new Triple();
        t1.set(8, 8, 8);
        Triple t2 = new Triple();
        t2.set(8, 5, 8);
        Triple t3 = new Triple();
        t3.set(2, 4, 5);
        Triple t4 = new Triple();
        t4.set(1, 2, 3);

        // min
        System.out.println("[min メソッドの確認]");
        t1.show();
        System.out.println("最小の値: " + t1.min());
        t2.show();
        System.out.println("最小の値: " + t2.min());
        t3.show();
        System.out.println("最小の値: " + t3.min());
        t4.show();
        System.out.println("最小の値: " + t4.min());
        System.out.println("\n");

        // hasPair
        System.out.println("[hasPair メソッドの確認]");
        t1.show();
        System.out.println("2つ以上同じ値があるか: " + t1.hasPair());
        t2.show();
        System.out.println("2つ以上同じ値があるか: " + t2.hasPair());
        t3.show();
        System.out.println("2つ以上同じ値があるか: " + t3.hasPair());
        t4.show();
        System.out.println("2つ以上同じ値があるか: " + t4.hasPair());
        System.out.println("\n");

        // isAllSame
        System.out.println("[isAllSame メソッドの確認]");
        t1.show();
        System.out.println("すべて同じか: " + t1.isAllSame());
        t2.show();
        System.out.println("すべて同じか: " + t2.isAllSame());
        t3.show();
        System.out.println("すべて同じか: " + t3.isAllSame());
        t4.show();
        System.out.println("すべて同じか: " + t4.isAllSame());
        System.out.println("\n");

        // add
        System.out.println("[add メソッドの確認]");
        System.out.print("t1.show() : ");
        t1.show();
        System.out.print("t2.show() : ");
        t2.show();
        System.out.println("t1.add(t2)を実行");
        t1.add(t2);
        System.out.print("t1.show() : ");
        t1.show();
        System.out.println("\n");
        System.out.print("t3.show() : ");
        t3.show();
        System.out.print("t4.show() : ");
        t4.show();
        System.out.println("t4.add(t3)を実行");
        t4.add(t3);
        System.out.print("t4.show() : ");
        t4.show();
    }
}