class Box{
    int height;
    int width;

    Box(){
        height = 1;
        width = 1;
    }

    Box(int h,int w){
        height = h;
        width = w;
    }

    void draw(){
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
