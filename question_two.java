package com.example.revati.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class question_two extends AppCompatActivity {

    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        TextView questionTextView = (TextView) findViewById(R.id.question);
        questionTextView.setText(Html.fromHtml("<b>" + "Question 2:\n".toUpperCase() + "</b>" + "<br>" + "<br>" + "Where was the first Post Office opened in India?" + "</br>" + "</br>"));

        final EditText answerText = (EditText) findViewById(R.id.editText);
        answerText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                answer = answerText.getText().toString().trim();
                if (answer.equalsIgnoreCase("kolkata")) {
                    Toast.makeText(question_two.this,"Correct answer!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(question_two.this,"Incorrect answer!", Toast.LENGTH_SHORT).show();
                }
                answerText.setText(answer);
                return false;
            }
        });
    }
}
