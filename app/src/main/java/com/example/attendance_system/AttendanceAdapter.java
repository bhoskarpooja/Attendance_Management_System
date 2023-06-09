package com.example.attendance_system;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.ViewHolder>{

    ArrayList<service> mList;
    Context context;

    public AttendanceAdapter(ArrayList<service> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.data_list,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        service vacancy1 = mList.get(position);
        holder.txtname.setText("Student Name "+vacancy1.name);
        holder.txtaddress.setText("Presenting "+vacancy1.presenting);
        holder.txtprofile.setText("date "+vacancy1.date);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{



        TextView txtname,txtaddress,txtprofile;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname = itemView.findViewById(R.id.txtbname);
            txtaddress = itemView.findViewById(R.id.txtaddress);
            txtprofile = itemView.findViewById(R.id.txtprofile);

        }
    }
}
