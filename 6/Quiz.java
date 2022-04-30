import java.util.*;
class Quiz {
    private Entry ent;      // 問題(エントリ)
    private String input;   // 入力

    Quiz(Entry ent) {
        this.ent = ent;
    }

    Entry getEntry(){
        return ent;
    }

    void show(){
        System.out.println(ent.getMeaning());
    }

    boolean ask(){
        Scanner in = new Scanner(System.in);
        input = in.next();
        return input.equals(ent.getWord());
    }
}