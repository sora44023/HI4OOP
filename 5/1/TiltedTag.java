class TiltedTag extends Tag {
    private boolean lower;
    private int cnt;
    TiltedTag(String name, boolean lower) {
        super(name);
        this.lower = lower;
    }
    @Override
    void show(){
        cnt = 0;
        int len = name.length()+2;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(i == 0 || i == len-1){
                    if(j == 0 || j == len-1){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                }else if(j == 0 || j==len-1){
                    System.out.print("|");
                }else if(i>0 && i == j && lower){
                    System.out.print(name.charAt(cnt));
                    cnt += 1;
                }else if(i>0 && i+j==len-1 && !lower){
                    System.out.print(name.charAt(len-3-cnt));
                    cnt += 1;
                }else{
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
}