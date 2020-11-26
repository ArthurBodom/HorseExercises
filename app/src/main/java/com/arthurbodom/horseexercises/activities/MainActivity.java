package com.arthurbodom.horseexercises.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.arthurbodom.horseexercises.R;
import com.arthurbodom.horseexercises.adapters.CustomAdapter;
import com.arthurbodom.horseexercises.database.MyDatabaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    MyDatabaseHelper myDB;
    ArrayList<String> ex_id, ex_name, ex_category, ex_level, ex_description, ex_objectives, ex_attention, ex_pace, ex_image;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });

        myDB = new MyDatabaseHelper(MainActivity.this);
        ex_id = new ArrayList<>();
        ex_name = new ArrayList<>();
        ex_level = new ArrayList<>();
        ex_pace = new ArrayList<>();
//        ex_category = new ArrayList<>();
//        ex_description = new ArrayList<>();
//        ex_objectives = new ArrayList<>();
//        ex_attention = new ArrayList<>();
//        ex_image = new ArrayList<>();

        storeDataInArray();

        customAdapter = new CustomAdapter(MainActivity.this, ex_id, ex_name, ex_level, ex_pace);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    void storeDataInArray() {
        Cursor cursor = myDB.readAllData();

        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {
                ex_id.add(cursor.getString((0)));
                ex_name.add(cursor.getString(1));
                ex_level.add(cursor.getString(3));
                ex_pace.add(cursor.getString(7));
//                ex_category.add(cursor.getString(2));
//                ex_description.add(cursor.getString(4));
//                ex_objectives.add(cursor.getString(5));
//                ex_attention.add(cursor.getString(6));
//                ex_image.add(cursor.getString(8));
            }
        }
    }
}