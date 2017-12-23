package com.example.dell.mashawer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 12/23/2017.
 */

public class DriverAdapter extends RecyclerView.Adapter<DriverAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<Driver_Info> infoArrayList;

    public DriverAdapter(Context mContext, ArrayList<Driver_Info> infoArrayList) {
        this.mContext=mContext;
        this.infoArrayList=infoArrayList;
    }
    @Override
    public DriverAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.card_view,parent,false);

        return new DriverAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DriverAdapter.MyViewHolder holder, int position) {
        Driver_Info driver=infoArrayList.get(position);
        holder.Uname.setText(driver.getName());
        holder.Udistenation.setText(driver.getDistenaton());
    }

    @Override
    public int getItemCount() {
        return infoArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Uname,Udistenation;
        public MyViewHolder(View itemView) {
            super(itemView);
            Uname=(TextView) itemView.findViewById(R.id.txt_name);
            Udistenation=(TextView) itemView.findViewById(R.id.txt_desti);
        }
    }
}
