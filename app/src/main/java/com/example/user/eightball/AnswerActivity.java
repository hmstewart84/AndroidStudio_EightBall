package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 30/08/2016.
 */
public class AnswerActivity extends AppCompatActivity {

    TextView mAnswerText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d("EightBall:", "Answers Activity on create Called");

        mAnswerText = (TextView)findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answer = extras.getString("answer");

        mAnswerText.setText(answer);
    }
}
