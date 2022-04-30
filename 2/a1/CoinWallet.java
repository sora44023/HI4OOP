class CoinWallet{
    private int coin100;
    private int coin10;

    CoinWallet(int c100, int c10){
        coin100 = c100;
        coin10 = c10;
    }
    
    int sum(){
        return 100*coin100+10*coin10;
    }

    void show(){
        System.out.println(sum()+"Yen (100:"+coin100+", 10:"+coin10+")");
    }

    boolean hasMoreMoneyThan(CoinWallet c){
        if(sum()>c.sum()){
            return true;
        }else{
            return false;
        }
    }

    void transferTo(CoinWallet c){
        c.coin100+=coin100;
        c.coin10+=coin10;
        coin100 = 0;
        coin10 = 0;
    }
}