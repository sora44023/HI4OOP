class Bar{
    int len;
    char pattern;

    Bar(){
        len = 1;
        pattern = '-';
    }

    Bar(int len,char pattern){
        this.len = len;
        this.pattern = pattern;
    }

    void draw(){
        draw(false);
    }

    void draw(int times){
        for(int cnt=0; cnt<times; cnt++){
            draw();
        }
    }
    void draw(boolean isvert){
        for(int i=0; i<len; i++){
            System.out.print(pattern);
            if(isvert)
                System.out.println();
        }
        if(!isvert)
            System.out.println();
    }
}