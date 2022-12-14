package com.example.reminderapp;
import androidx.room.Entity;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;


@Entity
public class Reminder {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "user_name")
    public String user;

    @ColumnInfo(name = "body_text")
    public String body;
}
