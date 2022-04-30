class Triple {
    int[] n = new int[3];
    void set(int num1, int num2, int num3){
        n[0] = num1;
        n[1] = num2;
        n[2] = num3;
    }
    void show(){
        System.out.println(n[0]+"-"+n[1]+"-"+n[2]); 
    }
    int min(){
        int minnum = n[0];
        for (int i=1;i<n.length;i++){
            if(minnum > n[i]){
                minnum = n[i];
            }
        }
        return minnum;
    }
    boolean hasPair(){
        if(n[0]==n[1] || n[1]==n[2] || n[0]==n[2]){
            return true;
        }
        return false;
    }
    boolean isAllSame(){
        if(n[0]==n[1] && n[1]==n[2]){
            return true;
        }
        return false;
    }
    void add(Triple t){
        for(int i=0; i<n.length; i++){
            n[i]+=t.n[i];
        }
    }
}