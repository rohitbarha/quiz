package com.example.revati.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class question_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        TextView questionTextView = (TextView)findViewById(R.id.question);
        questionTextView.setText(Html.fromHtml("<b>"+"Question 1:\n".toUpperCase()+"</b>"+"<br>"+"<br>"+"Cocoa : Chocolate : : _________ : _________"+"</br>"+"</br>"));

    }
}
