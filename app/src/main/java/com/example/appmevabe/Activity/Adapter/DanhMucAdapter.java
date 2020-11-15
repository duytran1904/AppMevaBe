package com.example.appmevabe.Activity.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.appmevabe.Activity.Model.Danhmuc;
import com.example.appmevabe.R;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DanhMucAdapter extends RecyclerView.Adapter<DanhMucAdapter.Itemholder> {
    Context context;
    ArrayList<Danhmuc> DanhmucArraylist;

    public DanhMucAdapter(Context context, ArrayList<Danhmuc> danhmucArraylist) {
        this.context = context;
        DanhmucArraylist = danhmucArraylist;
    }

    @NonNull
    @Override
    public Itemholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context =parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.main_rv_onerow,parent,false);
        Itemholder itemHolder = new Itemholder(v);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Itemholder holder, int position) {
        final Danhmuc DM= DanhmucArraylist.get(position);
        Glide.with(context).load(DM.getHinh_dm())
                .error(R.drawable.ic_launcher_background)
                .into(holder.hinhmenu);
        holder.tenmenu.setText(DM.getTen_dm());

    }

    @Override
    public int getItemCount() {
        return DanhmucArraylist.size();
    }


    public class Itemholder extends RecyclerView.ViewHolder {
        TextView tenmenu;
        ImageView hinhmenu;


        public Itemholder(@NonNull View itemView) {
            super(itemView);
            tenmenu = itemView.findViewById(R.id.txt_mainrv);
            hinhmenu = itemView.findViewById(R.id.img_mainrv);

        }
    }
}
