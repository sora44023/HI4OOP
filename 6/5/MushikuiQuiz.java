class MushikuiQuiz extends Quiz{
    private int step;

    MushikuiQuiz(Entry ent, int step){
        super(ent);
        this.step = step;
    }

    @Override
    void show(){
        System.out.println(getEntry().getMeaning());
        System.out.print("\nヒント: ");
        for (int i=0; i<getEntry().getWord().length(); i++){
            if (i % step == 0)
                System.out.print("_");
            else
                System.out.print(getEntry().getWord().charAt(i));
        }
        System.out.println();
    }
} 