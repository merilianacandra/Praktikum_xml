package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DashAdapter extends RecyclerView.Adapter<DashAdapter.DashViewHolder>{

    public DashAdapter(Context mContext, List<Dashboard> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    Context mContext;
    List<Dashboard> mData;



    @NonNull
    @Override
    public DashViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.rv_dashboard,viewGroup, false);
        return new DashViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull DashViewHolder dashViewHolder, int position) {
        dashViewHolder.judul.setText(mData.get(position).getTitle());
        dashViewHolder.deskrip.setText(mData.get(position).getContent());
        dashViewHolder.poto.setImageResource(mData.get(position).getEventPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class DashViewHolder extends RecyclerView.ViewHolder{

        TextView judul, deskrip;
        ImageView poto;
        public DashViewHolder(@NonNull View itemView){
            super(itemView);
            judul = itemView.findViewById(R.id.judul_event);
            deskrip = itemView.findViewById(R.id.deskrip_event);
            poto = itemView.findViewById(R.id.img_event);
        }
    }
}

