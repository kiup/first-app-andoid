package com.example.practica1sistemas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        Intent intent = getIntent();
        int add1 = Integer.valueOf(intent.getStringExtra(MainActivity.ADD1));
        int add2 = Integer.valueOf(intent.getStringExtra(MainActivity.ADD2));
        int result = add1 +add2;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(String.valueOf(result));
    }
}
