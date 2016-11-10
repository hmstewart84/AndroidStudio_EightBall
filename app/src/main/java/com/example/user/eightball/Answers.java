package com.example.user.eightball;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 31/08/2016.
 */
public abstract class Answers implements Answerable {

    protected ArrayList<String> mAnswers;

    public Answers() {
        mAnswers = new ArrayList<String>();
    }

    public Answers(ArrayList<String> answers) {
        mAnswers = new ArrayList<String>(answers);
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(mAnswers);
    }

    public void add(String answer) {
        mAnswers.add(answer);
    }

    public int getLength() {
        return mAnswers.size();
    }

    public String getAnswerAtIndex(int index) {
        return mAnswers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listLength = getLength();
        int index = rand.nextInt(listLength);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    abstract public void setupAnswers();
}
