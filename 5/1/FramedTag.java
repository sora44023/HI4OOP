class FramedTag extends Tag{
    private int padding;
    private int width;
    private int height;
    private int cnt;
    FramedTag(String name, int padding){
		super(name);
		this.padding = padding;
	}

    @Override
    void show(){
        width = name.length() + 2 + padding*2;
        height = 3 + padding*2;
        cnt = 0;
        for(int h = 0; h < height; h++){
            for(int w = 0; w < width; w++){
                if(h == 0 || h == height-1){
                    if(w == 0 || w == width-1){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                }else if(w == 0 || w==width-1){
                    System.out.print("|");
                }else if(h == height/2 && w > padding && w < (width-padding-1)){
                    System.out.print(name.charAt(cnt));
                    cnt += 1;
                }else{
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
}