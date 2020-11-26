package com.arthurbodom.horseexercises.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.arthurbodom.horseexercises.R;
import com.arthurbodom.horseexercises.database.MyDatabaseHelper;

public class AddActivity extends AppCompatActivity {

    EditText input_name, input_category, input_level, input_description, input_objectives, input_attention, input_pace, input_image;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        input_name = findViewById(R.id.input_name);
        input_category = findViewById(R.id.input_category);
        input_level = findViewById(R.id.input_level);
        input_description = findViewById(R.id.input_description);
        input_objectives = findViewById(R.id.input_objectives);
        input_attention = findViewById(R.id.input_attention);
        input_pace = findViewById(R.id.input_pace);
        input_image = findViewById(R.id.input_image);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper db = new MyDatabaseHelper(AddActivity.this);
                db.addExercise(input_name.getText().toString().trim(),
                        input_category.getText().toString().trim(),
                        input_level.getText().toString().trim(),
                        input_description.getText().toString().trim(),
                        input_objectives.getText().toString().trim(),
                        input_attention.getText().toString().trim(),
                        input_pace.getText().toString().trim(),
                        input_image.getText().toString().trim());
            }
        });
    }
}