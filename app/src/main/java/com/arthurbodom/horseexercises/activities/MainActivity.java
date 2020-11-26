package com.arthurbodom.horseexercises.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.arthurbodom.horseexercises.R;
import com.arthurbodom.horseexercises.models.Exercise;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Exercise avancer = new Exercise(1, "Avancer", "Travail à pied", "1 - Facile", "res", "Faire avancer son cheval", "Faire en sorte que son cheval se déplace vers l'avant", "Vérifier qu'il va bien vers l'avant et non vers l'arrière ", "Pas");

        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_category = findViewById(R.id.tv_category);
        TextView tv_level = findViewById(R.id.tv_level);
        TextView tv_description = findViewById(R.id.tv_description);
        TextView tv_objectives = findViewById(R.id.tv_objectives);

        tv_name.setText(avancer.getName());
        tv_category.setText(avancer.getCategory());
        tv_level.setText(avancer.getLevel());
        tv_description.setText(avancer.getDescription());
        tv_objectives.setText(avancer.getObjectives());
    }
}