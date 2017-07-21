package com.example.practica1sistemas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String ADD1 = "com.example.practica1sistemas.myapplication.ADD1";
    public final static String ADD2 = "com.example.practica1sistemas.myapplication.ADD2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view){
        Intent intent = new Intent(this, SumActivity.class);
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        String add1 = number1.getText().toString();
        String add2 = number2.getText().toString();
        intent.putExtra(ADD1, add1);
        intent.putExtra(ADD2, add2);
        startActivity(intent);

    }
}
