package com.arthurbodom.horseexercises.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arthurbodom.horseexercises.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private ArrayList ex_id, ex_name, ex_level, ex_pace; //ex_category, ex_description, ex_objectives, ex_attention, ex_image;

    public CustomAdapter(Context context, ArrayList ex_id, ArrayList ex_name, ArrayList ex_level, ArrayList ex_pace) {
//                  ArrayList ex_category, ArrayList ex_description, ArrayList ex_objectives,
//                  ArrayList ex_attention, ArrayList ex_image) {
        this.context = context;
        this.ex_id = ex_id;
        this.ex_name = ex_name;
        this.ex_level = ex_level;
        this.ex_pace = ex_pace;
//        this.ex_category = ex_category;
//        this.ex_description = ex_description;
//        this.ex_objectives = ex_objectives;
//        this.ex_attention = ex_attention;
//        this.ex_image = ex_image;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id_text.setText(String.valueOf(ex_id.get(position)));
        holder.name_text.setText(String.valueOf(ex_name.get(position)));
        holder.level_text.setText(String.valueOf(ex_level.get(position)));
        holder.pace_text.setText(String.valueOf(ex_pace.get(position)));
    }

    @Override
    public int getItemCount() {
        return ex_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id_text, name_text, level_text, pace_text;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id_text = itemView.findViewById(R.id.id_text);
            name_text = itemView.findViewById(R.id.name_text);
            level_text = itemView.findViewById(R.id.level_text);
            pace_text = itemView.findViewById(R.id.pace_text);
        }
    }
}
