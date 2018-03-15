package com.example.android.newhomes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.android.newhomes.Question2Activity;


public class Question12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question12);
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
                openQuestion7();
            }
        });
    }

    public void openQuestion7() {
        Intent intent = new Intent(this, Question7Activity.class);
        startActivity(intent);
        Question2Activity age = new Question2Activity();
        int userAge = age.userAge;
        int ageDifference = 65 - userAge;

        if (userAge < 21 || userAge >= 65) {

        } else {
            if (ageDifference > 25) {

            }
        }
    }

}
