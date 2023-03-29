package com.example.attendance_system;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.ViewHolder> {


    ArrayList<Time> mList;
    private RecyclerViewClickListener listener;

    public TimeAdapter(ArrayList<Time> mList, RecyclerViewClickListener listener) {
        this.mList = mList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.useritem,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Time vacancy1 = mList.get(position);
        holder.txtbname.setText("Department "+vacancy1.department);
        holder.txtaddress.setText("Year "+vacancy1.year);

        Glide.with(holder.img1.getContext()).load(vacancy1.getImageurl()).into(holder.img1);


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


    ImageView img1;
    TextView txtbname,txtaddress,txttype;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        img1 =itemView.findViewById(R.id.img1);
        txtbname = itemView.findViewById(R.id.nametext);
        txtaddress = itemView.findViewById(R.id.coursetext);
        txttype = itemView.findViewById(R.id.emailtext);
    }
}

}
