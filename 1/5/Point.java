class Point{
    int x;
    int y;
    Point(){
        set(0,0);
    }

    Point(int x, int y){
        set(x,y);
    }

    // (2)
    double getDistance(Point p){
        double d;
        d = Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
        return d;
    }

    void set(int x, int y){
        this.x = x;
        this.y = y;
    }
}