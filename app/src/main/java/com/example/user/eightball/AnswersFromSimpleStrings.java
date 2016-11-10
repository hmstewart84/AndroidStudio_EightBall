package com.example.user.eightball;

import java.util.ArrayList;

/**
 * Created by user on 31/08/2016.
 */
public class AnswersFromSimpleStrings extends Answers {

    public AnswersFromSimpleStrings() {
        super();
        setupAnswers();
    }

    public AnswersFromSimpleStrings(ArrayList<String> answers) {
        super(answers);
    }

    @Override
    public void setupAnswers() {
        String[] answers = {
                "Yes!",
                "That would be ab ecumenical matter!"
        };
        for (String answer : answers) {
            add(answer);
        }

    }
}
