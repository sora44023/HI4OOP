class CardSimulator{
    public static void main(String[] args){
        int cpu1 = 0;
        int cpu2 = 0;
        if (args.length != 1){
            System.out.println("引数を1つ指定して下さい．");
            System.out.println("(例) java CardSimulator 5");
            System.exit(1);
        }
        for(int i=1; i<=Integer.parseInt(args[0]); i++){
            Card c1 = new Card();
            Card c2 = new Card();
            System.out.print("["+i+"] CPU1: "+c1+" vs CPU2: "+c2+" : ");
            if(c1.isStrongerThan(c2)==true){
                System.out.println("CPU1 wins!");
                cpu1++;
            }else if(c1.isSameAs(c2)==true){
                System.out.println("DRAW");
            }else{
                System.out.println("CPU2 wins!");
                cpu2++;
            }
        }  
        System.out.println("\nScore:\n   CPU1: "+cpu1+"\n   CPU2: "+cpu2);
        if(cpu1>cpu2){
            System.out.println("CPU1 wins!!");
        }else if(cpu1<cpu2){
            System.out.println("CPU2 wins!!");
        }else{
            System.out.println("DRAW");
        }
    }
}