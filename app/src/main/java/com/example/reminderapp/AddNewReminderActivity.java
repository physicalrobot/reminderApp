package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNewReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_reminder);

        EditText newReminder = findViewById(R.id.enterNewReminder);

        Button saveButt = findViewById(R.id.save_button);

        saveButt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
              saveNewReminder(newReminder.getText().toString());
            }
        });

    }

    private void saveNewReminder(String newReminder){

        ReminderDatabase db = ReminderDatabase.getDbInstance(this.getApplicationContext());

        Reminder reminder = new Reminder();
        reminder.body = newReminder;


        db.reminderDao().insertReminder(reminder);
        finish();

    }
}