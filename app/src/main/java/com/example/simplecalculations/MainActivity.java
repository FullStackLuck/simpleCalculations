package com.example.simplecalculations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;
    private EditText firstNumberEditTextView;
    private EditText secNumberEditTextView;

    int result = 0;
    int firstNum = 0;
    int secNum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        firstNumberEditTextView =findViewById(R.id.firstNumberEditText);
        secNumberEditTextView =findViewById(R.id.secNumberEditText);
    }

    public void sum(View view) {
        Toast.makeText(this, "Works", Toast.LENGTH_SHORT).show();

        firstNum=0;
        secNum=0;
        firstNum= Integer.parseInt(firstNumberEditTextView.getText().toString());
        secNum= Integer.parseInt(secNumberEditTextView.getText().toString());
        result= firstNum + secNum;
        resultTextView.setText(Integer.toString(result));
    }
}