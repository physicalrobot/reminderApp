package com.example.reminderapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ReminderDao {
    @Query("SELECT * FROM reminder")
    List<Reminder> getAll();

    @Query("SELECT * FROM reminder WHERE uid IN (:reminderId)")
    List<Reminder> loadAllByIds(int[] reminderId);

    @Query("SELECT * FROM reminder WHERE user_name LIMIT 1")
    Reminder findByName(String username , String bodytext );

    @Insert
    void insertReminder(Reminder... reminders);

    @Delete
    void delete(Reminder reminder);

}
