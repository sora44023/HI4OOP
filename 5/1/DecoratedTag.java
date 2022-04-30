class DecoratedTag extends Tag{
    private char decochar;
    private int decolen;
    DecoratedTag(String name, char decochar , int decolen){
		super(name);
		this.decochar = decochar;
		this.decolen = decolen;
	}

    @Override
    void show(){
        for(int i=0; i<decolen; i++){
            System.out.print(decochar);
        }
        System.out.print(" "+name+" ");
        for(int i=0; i<decolen; i++){
            System.out.print(decochar);
        }
        System.out.println();
    }
}