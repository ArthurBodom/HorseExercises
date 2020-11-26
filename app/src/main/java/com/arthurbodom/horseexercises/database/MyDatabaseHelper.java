package com.arthurbodom.horseexercises.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "EquitapExercises.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "exercises";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_CATEGORY = "category";
    private static final String COLUMN_LEVEL = "level";
    private static final String COLUMN_DESCRIPTION = "description";
    private static final String COLUMN_OBJECTIVES = "objectives";
    private static final String COLUMN_ATTENTION = "attention";
    private static final String COLUMN_PACE = "pace";
    private static final String COLUMN_IMAGE = "image";


    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME +
                        " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_NAME + " TEXT, " +
                        COLUMN_CATEGORY + " TEXT, " +
                        COLUMN_LEVEL + " TEXT, " +
                        COLUMN_DESCRIPTION + " TEXT, " +
                        COLUMN_OBJECTIVES + " TEXT, " +
                        COLUMN_ATTENTION + " TEXT, " +
                        COLUMN_PACE + " TEXT, " +
                        COLUMN_IMAGE + " TEXT);";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addExercise(String name, String category, String level, String description, String objectives, String attention, String pace, String image) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_CATEGORY, category);
        cv.put(COLUMN_LEVEL, level);
        cv.put(COLUMN_DESCRIPTION, description);
        cv.put(COLUMN_OBJECTIVES, objectives);
        cv.put(COLUMN_ATTENTION, attention);
        cv.put(COLUMN_PACE, pace);
        cv.put(COLUMN_IMAGE, image);

        long result = db.insert(TABLE_NAME, null, cv);

        if (result == -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Added successfully!", Toast.LENGTH_SHORT).show();
        }
    }

    public Cursor readAllData() {
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }

        return cursor;
    }
}
