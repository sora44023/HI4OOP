class Team{
    String name;
    BasketballScore score;
    Team(String name, BasketballScore score){
        this.name = name;
        this.score = score;
    }

    int compareScore(Team t){
        // 追記せよ
        if(score.getTotal() > t.score.getTotal()){
            return 1;
        }else if(score.getTotal() == t.score.getTotal()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString(){
        // 追記せよ
        return "[" + name + "] " + score.toString();
    }
}