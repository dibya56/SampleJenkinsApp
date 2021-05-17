package com.example.samplejenkinsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.btn);

        textView1 = (TextView)findViewById((R.id.txt));

        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn) {
            textView1.setText("Button 1 is clicked");
        }

    }
}