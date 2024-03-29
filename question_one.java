package com.example.revati.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        TextView questionTextView = (TextView)findViewById(R.id.question);
        questionTextView.setText(Html.fromHtml("<b>"+"Question 1:\n".toUpperCase()+"</b>"+"<br>"+"<br>"+"Cocoa : Chocolate : : _________ : _________"+"</br>"+"</br>"));

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio4)
                    Toast.makeText(question_one.this,"Correct Choice",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(question_one.this,"Incorrect Choice",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void nextQuestion(View view){
        Intent intent = new Intent(question_one.this,question_two.class);
        startActivity(intent);
    }
}
