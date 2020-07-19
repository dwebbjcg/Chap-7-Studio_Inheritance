package FunWithQuizzes;

import java.util.ArrayList;

public class Checkbox extends Question {
    private ArrayList<String> checkboxChoices;

    public Checkbox(String question, ArrayList<String> checkboxChoices, String answer) {
        super(question, answer);

        this.checkboxChoices = checkboxChoices;
    }
}
