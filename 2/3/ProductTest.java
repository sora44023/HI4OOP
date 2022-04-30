class ProductTest{
    public static void main(String[] args){
        Product p1 = new Product(11, "Lenovo ThinkPad T14", false);
        System.out.println("p1 の文字列表現は、「" + p1 + "」です。");
        Product p2 = new Product(33, "Nintendo Switch", true);
        System.out.println(p2);
    }
}