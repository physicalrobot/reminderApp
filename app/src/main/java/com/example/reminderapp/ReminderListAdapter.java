package com.example.reminderapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReminderListAdapter extends RecyclerView.Adapter<ReminderListAdapter.MyViewHolder>
{

    private Context context;
    private List<Reminder> reminderList;

    public ReminderListAdapter(Context context){
        this.context = context;
    }

    public void setReminderList(List<Reminder> reminderList){
        this.reminderList = reminderList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ReminderListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvUsername.setText(this.reminderList.get(position).user);

    }



    @Override
    public int getItemCount() {
        return this.reminderList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvUsername;
        TextView tvReminderBody;
        public MyViewHolder(View view){
            super(view);
            tvUsername = view.findViewById(R.id.tv_username);
            tvReminderBody = view.findViewById(R.id.tv_reminderbody);
        }
    }
}
