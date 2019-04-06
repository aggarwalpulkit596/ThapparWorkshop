package com.maxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText number1,number2,operator;
    Button findResult;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Intent i = getIntent();
        String a = i.getStringExtra("myName");
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.operator);
        operator = findViewById(R.id.number2);
        findResult = findViewById(R.id.button2);
        result = findViewById(R.id.result);

        findResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int sum;
                switch (operator.getText().toString()){
                    case "+":
                        sum = a+b;
                        result.setText(sum+"");
                        break;
                    case "/":
                        sum = a/b;
                        result.setText(sum+"");
                        break;
                    case "-":
                        sum = a-b;
                        result.setText(sum+"");
                        break;
                    case "*":
                        sum = a*b;
                        result.setText(sum+"");
                        break;
                }
            }
        });

    }

}
