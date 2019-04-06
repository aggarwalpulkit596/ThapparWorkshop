package com.maxx.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        View.OnClickListener a = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();
                Intent i = new Intent(MainActivity.this,CalculatorActivity.class);
                i.putExtra("myName",a);
                startActivity(i);
            }
        };
        button.setOnClickListener(a);

    }
}
cb.lk/tu
