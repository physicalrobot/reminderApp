package com.example.reminderapp;



import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Reminder.class}, version = 1)
public abstract class ReminderDatabase extends RoomDatabase {
    public abstract ReminderDao reminderDao();

    private static ReminderDatabase INSTANCE;

    public static ReminderDatabase getDbInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ReminderDatabase.class,"reminder-database").allowMainThreadQueries().build();

        }
        return INSTANCE;
    }




}

