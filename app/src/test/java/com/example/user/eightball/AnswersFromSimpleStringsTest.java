package com.example.user.eightball;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 31/08/2016.
 */
public class AnswersFromSimpleStringsTest {

    @Test
    public void getAnswersTest() {
        Answers answers = new AnswersFromSimpleStrings();
        assertNotNull(answers.getAnswers() );
    }

    @Test
    public void getLengthTest() {
        Answers answers = new AnswersFromSimpleStrings();
        assertEquals(0, answers.getLength());
    }

    @Test
    public void addTest() {
        Answers answers = new AnswersFromSimpleStrings();
        answers.add("Something");
        assertEquals(1, answers.getLength() );
    }

    @Test
    public void getAnswerAtIndexTest() {
        Answers answers = new AnswersFromSimpleStrings();
        answers.add("Something");
        assertEquals("Something", answers.getAnswerAtIndex(0) );
    }

    @Test
    public void getAnswer() {
        Answers answers = new AnswersFromSimpleStrings();
        answers.add("Something");
        assertEquals("Something", answers.getAnswer() );
    }
}
