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
import com.example.android.newhomes.Question10Activity;

public class Question11Activity extends AppCompatActivity {

    int initialPayment = Question10Activity.initialPayment;
    int propertyValue = Question8Activity.propertyValue;
    int userAge = Question2Activity.userAge;
    int income = Question5Activity.income;
    int additionalIncome = Question7Activity.additionalIncome;
    int totalIncome = income + additionalIncome;
    int ageDiffSelfemployed = 60 - userAge;
    int ageDiffEmoloyed = 55 - userAge;
    double loan = propertyValue - initialPayment;
    double payableIncome = 0.3 * totalIncome;
    double payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question11);
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
                openResult();
            }
        });
    }

    public void openResult() {
        EditText editText = (EditText) findViewById(R.id.editText);
        String textImput = editText.getText().toString();
        int loanPeriod = Integer.parseInt(textImput);
        int numberOfMonths = loanPeriod * 12;

        if (Question1Activity.employed.isChecked()) {
            if (userAge < 21 || userAge >= 55 || loanPeriod > 20 || initialPayment < Question8Activity.minEquity) {
                Intent intent = new Intent(this, FailureActivity.class);
                startActivity(intent);
            } else {
                if (ageDiffEmoloyed >= 20 && loanPeriod == 20) {
                    payment = (loan*((0.22*loanPeriod/numberOfMonths)*Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)))/(Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)-1);
                    if (payment > payableIncome) {
                        Intent intent = new Intent(this, FailureActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, SuccessActivity.class);
                        startActivity(intent);
                    }
                } else {
                    payment = (loan*((0.22*loanPeriod/numberOfMonths)*Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)))/(Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)-1);

                    if (payment > payableIncome) {
                        Intent intent = new Intent(this, FailureActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, SuccessActivity.class);
                        startActivity(intent);
                    }
                }
            }
        }

        if (Question1Activity.selfEmployed.isChecked()) {
            if (userAge < 21 || userAge >= 60 || loanPeriod > 20 || initialPayment < Question8Activity.minEquity) {
                Intent intent = new Intent(this, FailureActivity.class);
                startActivity(intent);
            } else {
                if (ageDiffSelfemployed >= 20 && loanPeriod == 20) {
                    payment = (loan*((0.22*loanPeriod/numberOfMonths)*Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)))/(Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)-1);
                    if (payment > payableIncome) {
                        Intent intent = new Intent(this, FailureActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, SuccessActivity.class);
                        startActivity(intent);
                    }
                } else {
                    payment = (loan*((0.22*loanPeriod/numberOfMonths)*Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)))/(Math.pow(1+0.22*loanPeriod/numberOfMonths, numberOfMonths)-1);

                    if (payment > payableIncome) {
                        Intent intent = new Intent(this, FailureActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, SuccessActivity.class);
                        startActivity(intent);
                    }
                }
            }
        }

    }

}
