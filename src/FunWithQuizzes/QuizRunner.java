package FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<Question>();

//  Question 1
        questions.add(new TrueFalse("Is water wet?", "true"));

//  Question 2
        ArrayList<String> multChoices = new ArrayList<String>();

        multChoices.add("2");
        multChoices.add("4");
        multChoices.add("7");

        questions.add(new MultipleChoice("How many dwarves were there?", multChoices, "7"));

//  Question 3
        ArrayList<String> checkboxChoices = new ArrayList<String>();

        checkboxChoices.add("Bones");
        checkboxChoices.add("Leaves");
        checkboxChoices.add("Water");

        questions.add(new Checkbox("What is found in your body? Select all that apply." + checkboxChoices, checkboxChoices, "bones, water"));

        for (Question question : questions) {
            System.out.println(question);

            String choice = input.nextLine().toLowerCase();

            if(choice.equals(question.getAnswer())){
                System.out.println("Correct! 20 points" + "\n");
                score += 20;
            } else {
                System.out.println("Incorrect. 0 points." + "\n");
                score += 0;
            }
        }
        System.out.println("Yay! Your score is " + score + " points. \nThank you for playing!");

        input.close();
        }
    }