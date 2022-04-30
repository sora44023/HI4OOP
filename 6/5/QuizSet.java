import java.util.*;
class QuizSet {
    private String name;
    private List<Quiz> quizlist;
    private int index;

    QuizSet(String name){
        this.name = name;
        quizlist = new ArrayList<Quiz>();
        index = 0;
    }

    void add(Quiz q){
        quizlist.add(q);
    }


    Quiz getQuiz(){
        return quizlist.get(index);
    }

    Quiz getNextQuiz(){
        return quizlist.get(index++);
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
