package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;
import java.util.Random;

/**
 * Created by user on 30/08/2016.
 */
public class MainActivity extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mShakeButton;
    Button mShakeButton2;

    Answers mAnswers;
    Answers mAnswers2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream file = getResources().openRawResource(R.raw.sandy_answers);
        InputStream file2 = getResources().openRawResource(R.raw.itcrowd_answers);

        mAnswers = new AnswersFromFile(file);
        mAnswers2 = new AnswersFromFile(file2);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mShakeButton = (Button)findViewById(R.id.shake_button);
        mShakeButton2 = (Button)findViewById(R.id.shake_another_button);


        mShakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball", "shake button clicked");
                Log.d("Eightball", "The question asked was '" + question + "'");

                String answer = mAnswers.getAnswer();

                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("answer", answer);

                startActivity(intent);

            }
        });

        mShakeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball", "shake button clicked");
                Log.d("Eightball", "The question asked was '" + question + "'");

                String answer = mAnswers.getAnswer();

                Intent intent = new Intent(MainActivity.this, AnswerActivity2.class);
                intent.putExtra("answer", answer);

                startActivity(intent);

            }
        });
    }


}
