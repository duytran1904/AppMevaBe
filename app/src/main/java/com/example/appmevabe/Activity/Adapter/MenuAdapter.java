package com.example.appmevabe.Activity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.appmevabe.Activity.Model.Menu;
import com.example.appmevabe.R;

import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {
    ArrayList<Menu> menuarrayList;
    Context context;

    public MenuAdapter(ArrayList<Menu> menuarrayList, Context context) {
        this.menuarrayList = menuarrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return menuarrayList.size(); //lấy hết dữ liệu trong mảng
    }

    @Override
    public Object getItem(int i) {
        return menuarrayList.get(i); //get từng thuộc tính trong mảng

    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    // class con load dữ liệu nhanh hơn nếu dl đưa lên lần đầu nó sẽ bắt những ánh xạ, lần sau load trực tiếp vào thuộc tính trong layout
    public  class  ViewHolder{
        TextView txt_menu;
        ImageView img_menu;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        viewHolder = new ViewHolder();
        if(view == null)
        {
            viewHolder =new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.menu_onerow,null);
            viewHolder.txt_menu =view.findViewById(R.id.txt_menu);
            viewHolder.img_menu=view.findViewById(R.id.img_menu);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();

        }
        Menu Menu = (com.example.appmevabe.Activity.Model.Menu) getItem(i);
        viewHolder.txt_menu.setText(Menu.getTen_menu());
        Glide.with(context).load(Menu.getHinh_menu())//chưa load gọi thêm
                .error(R.drawable.ic_launcher_background)
                .into(viewHolder.img_menu);


        return view;
    }
}
