package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ReminderDatabase db = Room.databaseBuilder(getApplicationContext(),
        ReminderDatabase.class,'reminder-database').build();

}