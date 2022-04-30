import java.util.*;
class AnagramQuiz extends Quiz{
    private List<Character> charlist;

    private static List<Character> shuffle(String s){
        ArrayList<Character> cl = new ArrayList<Character>();
        for(int i=0; i<s.length(); i++)
            cl.add(s.charAt(i));
        while(true){
            if(s.charAt(0) == cl.get(0))
                Collections.shuffle(cl);
            else
                break;
        }
        return cl;
    }

    AnagramQuiz(Entry ent){
        super(ent);
        charlist = new ArrayList<Character>();
    }

    @Override
    void show(){
        System.out.println(getEntry().getMeaning());
        System.out.print("\nヒント: ");
        charlist = shuffle(getEntry().getWord());
        for (int i=0; i<charlist.size(); i++)
            System.out.print(charlist.get(i) +" ");
        System.out.println();
    }
}