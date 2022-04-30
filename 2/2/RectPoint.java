class RectPoint{
    private int x;
    private int y;
    
    RectPoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    int getQuad(){
        return getWhichQuad();
    }

    private int getWhichQuad(){
        if(x>0 && y>0){
            return 1;
        }else if(x<0 && y>0){
            return 2;
        }else if(x<0 && y<0){
            return 3;
        }else if(x>0 && y<0){
            return 4;
        }else{
            return 0;
        }
    }

    boolean isSameAs(RectPoint t){
        if(x==t.x && y==t.y)
            return true;
        else
            return false;
    }
}