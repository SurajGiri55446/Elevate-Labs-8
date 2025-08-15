
import java.util.List;

public class Question {
    private String question;
    private List<String> options;
    private int correctAnswer;

    public Question(String question,List<String> options, int correctAnswer){
        this.question=question;
        this.options=options;
        this.correctAnswer=correctAnswer;
    }

    public void DisplayQuestion(){
        System.out.println("Question:"+question);
        for (int i = 0; i < options.size() ; i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    public boolean isCorrect(int choice){
            if(this.correctAnswer==choice){
                return  true;
            }
            return false;
    }

    public int optionsCount(){
        return  options.size();
    }




}
