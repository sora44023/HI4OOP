class TeamTest{
    public static void main(String[] args){
        Team t1 = new Team("Rabbits", new BasketballScore(5,3));
        Team t2 = new Team("Monkeys", new BasketballScore(8,2));
        System.out.println(t1);
        System.out.println(t2);

        if(t1.compareScore(t2) == 0)
            System.out.println("Draw");
        else if(t1.compareScore(t2) > 0)
            System.out.println(t1.name + " wins!");
        else
            System.out.println(t2.name + " wins!");
    }
}