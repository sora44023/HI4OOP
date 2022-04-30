import java.util.*;
class QuizSet {
    private String name;
    private List<Quiz> quizlist;
    private int cnt;

    QuizSet(String name){
        this.name = name;
        quizlist = new ArrayList<Quiz>();
        cnt = 0;
    }

    void add(Quiz q){
        quizlist.add(q);
    }

    Quiz getNextQuiz(){
        return quizlist.get(cnt++);
    }

    int getSize(){
        return quizlist.size();
    }

    void shuffle(){
        Collections.shuffle(quizlist);
    }

    @Override
    public String toString(){
        return "" + name + " (size: " + getSize() + ")";
    }
}
