package com.arthurbodom.horseexercises.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.arthurbodom.horseexercises.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_test = findViewById(R.id.tv_test);

        String chibrax = "Chibre";

        tv_test.setText(chibrax);
    }
}