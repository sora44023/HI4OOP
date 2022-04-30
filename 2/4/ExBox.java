class ExBox extends Box{
    boolean fills;  //箱を塗りつぶすならtrue
    char character;

    ExBox(int h,int w,boolean f,char c){
        //実装せよ
        super(h,w);
        fills = f;
        character = c;
    }
    @Override
    void draw(){
        //実装せよ
        for (int i=0; i<height; i++){
            for (int j = 0; j < width; j++){
                if(i==0 || i==height-1 || j==0 || j==width-1 || fills){
                    System.out.print(character);
                }else{
                    System.out.print(" "); 
                }
            }
            System.out.print("\n");
        }
    }
}
