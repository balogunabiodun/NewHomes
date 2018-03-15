package com.example.android.newhomes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class Question2Activity extends AppCompatActivity {

    static int userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });

    }

    public void openQuestion3() {
        EditText editText = (EditText) findViewById(R.id.editText);
        String textInput = editText.getText().toString();
        int userYear = Integer.parseInt(textInput);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        userAge = currentYear - userYear;

        Intent intent = new Intent(this, Question3Activity.class);
        startActivity(intent);
    }

}
