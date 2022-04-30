class BasketballScore{
    private int twoPoint;   // 2ポイントシュート成功回数
    private int threePoint; // 3ポイントシュート成功回数

    BasketballScore(int twoPoint, int threePoint){
        this.twoPoint = twoPoint;
        this.threePoint = threePoint;
    }

    int getTotal(){
        return twoPoint * 2 + threePoint * 3;
    }
    @Override
    public String toString(){
        return "Total:" + getTotal() + " (2PT:" + twoPoint + ", 3PT:" + threePoint + ")";
    }
}