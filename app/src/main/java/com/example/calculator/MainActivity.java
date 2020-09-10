package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText N1;
    EditText N2;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N1 = findViewById(R.id.MainNumber1);
        N2 = findViewById(R.id.MainNumber2);
        Result = findViewById(R.id.MainResult);
    }

    public void Calc(View view) {

        double Number1 = Double.parseDouble(N1.getText().toString());
        double Number2 = Double.parseDouble(N2.getText().toString());
        Result.setText("" + (Number1 + Number2));
    }
}