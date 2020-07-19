package FunWithQuizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> multChoices;

    public MultipleChoice(String question, ArrayList<String> multChoices, String answer) {
        super(question, answer);

        this.multChoices = multChoices;
    }
}