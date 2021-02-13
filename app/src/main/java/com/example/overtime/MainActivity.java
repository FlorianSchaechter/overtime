package com.example.overtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button minus30,minus60,plus30,plus60;
    Button buttonSave;

    TextView outputField, finalField;

    int overtimeDeltaValue = 0;
    int overtimeValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minus30 = findViewById(R.id.minus30);
        minus60 = findViewById(R.id.minus60);
        plus30 = findViewById(R.id.plus30);
        plus60 = findViewById(R.id.plus60);

        outputField = findViewById(R.id.overtimeOutputField);
        finalField = findViewById(R.id.finalValueField);

        buttonSave = findViewById((R.id.saveTime));
    }

    public void minus30ButtonClicked(View view){
        updateDeltaField(-30);
    }
    public void minus60ButtonClicked(View view){
        updateDeltaField(-60);
    }
    public void plus30ButtonClicked(View view){
        updateDeltaField(30);
    }
    public void plus60ButtonClicked(View view){
        updateDeltaField(60);
    }

    private void updateDeltaField(int amount){
        overtimeDeltaValue += amount;
        outputField.setText(overtimeDeltaValue + " min");
    }

    public void saveTime(View view) {
        overtimeValue += overtimeDeltaValue;
        finalField.setText(overtimeValue + " min");

        //reset delta field to zero
        updateDeltaField(-overtimeDeltaValue);
    }

}