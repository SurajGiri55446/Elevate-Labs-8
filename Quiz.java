
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    

   public static void main(String[] args) {
                 List<Question> questions= new ArrayList<>();
         //1
         questions.add(new Question("Which of the following is not a primitive data type?",Arrays.asList("int","float","char","String"), 4));
         //2 
        questions.add(new Question("Which of these is a checked exception?", Arrays.asList("ArithmeticException","NullPointerException","IOException","ArrayIndexOutOfBoundsException"), 3));
        //3
        questions.add(new Question("which of the following is used to handle exception in java ?", Arrays.asList("try-catch","do-while loop","switch case","if-else statement"), 1));
        //4
        questions.add(new Question("which of the following is not valid access modifier in java?", Arrays.asList("static","public","try-catch","private"), 3));
        //5
        questions.add(new Question("Which package is imported by default in Java?", Arrays.asList("java.util","java.io","java.lang","none"), 3));
        int score=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("-------online Quiz on Java Basics------");
        for (int i = 0; i <questions.size(); i++){    
            Question q=questions.get(i);
            q.DisplayQuestion();

            int useChoice=-1;
            while(useChoice < 1 || useChoice > q.optionsCount()){
                 System.out.printf("Enter your choice (1-%d): ", q.optionsCount());
                 try {
                     useChoice=sc.nextInt();
                 } catch (Exception e) {
                    System.out.println("error choices:"+e.getMessage());
                    System.out.println("invalid choices , please  enter valid number");
                 }
                 if(q.isCorrect(useChoice)){
                    System.out.println("correct!");
                    score++;
                 }else{
                    System.out.println("Wrong answer!");
                 }
            }
        }
            System.out.printf("\nQuiz completed! Your score: %d/%d\n", 
                          score, questions.size());
              sc.close();

    }
}
