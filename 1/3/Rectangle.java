class Rectangle {
    int height;
    int width;

    int getArea(){
        return height*width;
    }
    void draw(boolean fils){
        for (int i=0; i<height; i++){
            for (int j = 0; j < width; j++){
                if(i==0 || i==height-1 || j==0 || j==width-1 || fils){
                    System.out.print("*");
                }else{
                    System.out.print(" "); 
                }
            }
            System.out.print("\n");
        }
    }
}