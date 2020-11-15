package com.example.appmevabe.Activity.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appmevabe.Activity.Model.Spmoi;
import com.example.appmevabe.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SanphammoiAdapter extends RecyclerView.Adapter<SanphammoiAdapter.Itemholder> {
    Context context;
    ArrayList<Spmoi> SpmoiArraylist;

    public SanphammoiAdapter(Context context, ArrayList<Spmoi> spmoiArraylist) {
        this.context = context;
        SpmoiArraylist = spmoiArraylist;
    }

    @NonNull
    @Override
    public Itemholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context =parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.spmoi_1row,parent,false);
        Itemholder itemHolder =new Itemholder(v);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Itemholder holder, int position) {
        Spmoi spmoi = SpmoiArraylist.get(position);
        Log.d("test",spmoi.getHinh_sp());
//        Picasso.with(context)
//                .load(spmoi.getHinh_sp())
//                .error(R.drawable.ic_launcher_background)
//                .into(holder.hinhsp);
        holder.tensp.setText(spmoi.getTen_sp());
        holder.giasp.setText(spmoi.getGia_sp());

    }

    @Override
    public int getItemCount() {
        return SpmoiArraylist.size();
    }

    public class Itemholder extends RecyclerView.ViewHolder {
        ImageView hinhsp;
        TextView tensp, giasp;


        public Itemholder(@NonNull View itemView) {
            super(itemView);
            hinhsp=itemView.findViewById(R.id.img_spmoi);
            tensp=itemView.findViewById(R.id.tv_ten);
            giasp=itemView.findViewById(R.id.tv_gia);
        }
    }
}
