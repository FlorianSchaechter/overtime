package com.example.overtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button minus30,minus60,plus30,plus60;
    Button buttonSave;

    int overtime_value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minus30 = (Button) findViewById(R.id.minus30);
        minus60 = (Button) findViewById(R.id.minus60);
        plus30 = (Button) findViewById(R.id.plus30);
        plus60 = (Button) findViewById(R.id.plus60);

        buttonSave = (Button) findViewById((R.id.saveTime));
    }
}