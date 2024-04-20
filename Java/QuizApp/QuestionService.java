package Java.QuizApp;

import java.util.Scanner;

public class QuestionService
{
     String[] selection = new String[5];
     Question[] questions = new Question[5];

     public QuestionService()
     {
             questions [0] = new Question(1,"What's Your Favorite Language" , "Java" , "Cpp", "Java Script" , "All" , "All");
             questions[1] = new Question(2 , "What is the size of double in Java" , "2","6","4","8","8");
             questions[2] = new Question(3,"Size of Char" , "2","4","6","8","2");
             questions[3]= new Question(4,"Size of long" ,"2","4","6","8","8");
             questions [4] = new Question(5,"size of boolean" , "1","4","6","8","1");

     }

     public void playQuiz()
    {
        int i =0;
        for(Question q: questions)
        {

            System.out.println("Question Number: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc= new Scanner(System.in);
            selection[i++]=sc.nextLine();
        }
        for(String s:selection)
        {
            System.out.println(s);
        }

    }
    public void printScore()
    {
        int score =0;
        for(int i=0; i<questions.length; i++)
        {
         Question que = questions[i];
         String actualAnswer = que.getAnswer();
         String userAns = selection[i];

         if(actualAnswer.equals(userAns))
         {
             score++;
         }

        }
        System.out.println("Your Score is: "+score);
    }

}
