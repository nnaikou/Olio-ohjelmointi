package com.example.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;
    private int result;
    private double dividend;
    private double divideResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput1 = findViewById(R.id.editTextInput1);
        textInput2 = findViewById(R.id.editTextInput2);
        textOutput = findViewById(R.id.textViewInput);

    }

    public void sum(View view) {;
        result = Integer.parseInt(textInput1.getText().toString()) + Integer.parseInt(textInput2.getText().toString());
        textOutput.setText(Integer.toString(result));

    }
    public void difference(View view) {
        result = Integer.parseInt(textInput1.getText().toString()) - Integer.parseInt(textInput2.getText().toString());
        textOutput.setText(Integer.toString(result));
    }
    public void multiply(View view) {
        result = Integer.parseInt(textInput1.getText().toString()) * Integer.parseInt(textInput2.getText().toString());
        textOutput.setText(Integer.toString(result));
    }
    public void divide(View view) {
        dividend = (double)(Integer.parseInt(textInput1.getText().toString()));
        divideResult = dividend / Integer.parseInt(textInput2.getText().toString());
        textOutput.setText(Double.toString(divideResult));
    }
}