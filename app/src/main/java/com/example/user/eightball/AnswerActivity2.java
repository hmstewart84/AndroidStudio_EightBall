package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.InputStream;


/**
 * Created by user on 30/08/2016.
 */
public class AnswerActivity2 extends AppCompatActivity {

    TextView mAnswerText;
    Answers mAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        Log.d("EightBall:", "Answers Activity on create Called");

        mAnswerText = (TextView)findViewById(R.id.answer_text2);

        InputStream inputStream = getResources().openRawResource(R.raw.itcrowd_answers);

        mAnswer = new AnswersFromFile(inputStream);
        String answer = mAnswer.getAnswer();
        mAnswerText.setText(answer);

    }
}

