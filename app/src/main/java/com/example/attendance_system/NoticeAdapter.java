package com.example.attendance_system;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoticeAdapter  extends RecyclerView.Adapter<NoticeAdapter.ViewHolder>{



    ArrayList<notice> mList;
    private RecyclerViewClickListener listener;

    public NoticeAdapter(ArrayList<notice> mList, RecyclerViewClickListener listener) {
        this.mList = mList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_list,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       notice vacancy1 = mList.get(position);
        holder.txtbname.setText(vacancy1.getSubject1());
        holder.txtaddress.setText(vacancy1.getSyllabus1());
        holder.txttype.setText(vacancy1.getSyllabus1());

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


        txtbname = itemView.findViewById(R.id.txtbname);
        txtaddress = itemView.findViewById(R.id.txtprofile);
        txttype = itemView.findViewById(R.id.txtaddress);

    }
}
}
