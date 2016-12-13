package com.example.user.wordcounterlab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */

public class Main extends AppCompatActivity {
    EditText inputText;
    Button shakeButton;
    TextView answerText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Main", "running");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);


        inputText = (EditText) findViewById(R.id.input_text);
        shakeButton = (Button) findViewById(R.id.shake_button);
        answerText = (TextView) findViewById(R.id.answer_text);


        shakeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               Log.d("Main", "Shake button clicked");
                String input = inputText.getText().toString();
                Log.d("Main", "Sentence: "+ input);
                WordCounter wordCounter  = new WordCounter();
                int total = wordCounter.getNumberOfWord(input);
                String totalCount = Integer.toString(total);
                answerText.setText(totalCount);

            }
       });
    }



    }

