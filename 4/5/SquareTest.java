class SquareTest{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("整数を引数で与えてください．");
            System.exit(0);
        }
        try {
            int size = Integer.parseInt(args[0]);
            Square r = new Square();
            r.setSize(size);
            r.draw();
        } catch (InvalidSizeException e) {
            System.out.println("サイズ指定が不正です．");
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("引数が整数ではありません．");
            System.exit(0);
        }
    }
}