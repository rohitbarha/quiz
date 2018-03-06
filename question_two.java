package com.example.revati.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class question_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        TextView questionTextView = (TextView)findViewById(R.id.question);
        questionTextView.setText(Html.fromHtml("<b>"+"Question 2:\n".toUpperCase()+"</b>"+"<br>"+"<br>"+"Where was the first Post Office opened in India?"+"</br>"+"</br>"));
    }
}
