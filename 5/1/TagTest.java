class TagTest{
    public static void main(String[] args){
        Tag t = new Tag("Alice");
        t.show();
        Tag dt = new DecoratedTag("Bob", '#', 3);
        dt.show();
        Tag ft1 = new FramedTag("Chris", 0);
        ft1.show();
        Tag ft2 = new FramedTag("Chris", 2);
        ft2.show();
        Tag tt1 = new TiltedTag("Chris", true);
        tt1.show();
        Tag tt2 = new TiltedTag("Chris", false);
        tt2.show();
    }
}