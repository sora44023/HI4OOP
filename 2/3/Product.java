class Product{
    private int id;
    private String name;
    boolean soldout;

    Product(int id,String name,boolean soldout){
        this.id = id;
        this.name = name;
        this.soldout = soldout; 
    }

    @Override
    public String toString(){
        if(soldout){
            return "No." + id + " " + name + " (品切れ中)";
        }else{
            return "No." + id + " " + name;
        }  
    }
}
