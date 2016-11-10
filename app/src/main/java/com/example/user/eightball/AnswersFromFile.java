package com.example.user.eightball;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by user on 31/08/2016.
 */
public class AnswersFromFile extends Answers {

    Scanner mFileReader;

    public AnswersFromFile(InputStream input) {
        super();
        mFileReader = new Scanner(input);
        setupAnswers();
    }

    public void setupAnswers() {
        while(mFileReader.hasNextLine()) {
            String theLine = mFileReader.nextLine();
            add(theLine);

        }
    }
}