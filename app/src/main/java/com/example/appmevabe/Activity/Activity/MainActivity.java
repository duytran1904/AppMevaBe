package com.example.appmevabe.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.appmevabe.Activity.Adapter.DanhMucAdapter;
import com.example.appmevabe.Activity.Adapter.MenuAdapter;
import com.example.appmevabe.Activity.Model.Danhmuc;
import com.example.appmevabe.Activity.Model.Menu;
import com.example.appmevabe.Activity.Ulti.Server;
import com.example.appmevabe.R;
import com.google.android.material.navigation.NavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ListView listView;
    NavigationView navigationView;
    ImageView img_menu;
    ArrayList<Danhmuc> Danhmucarraylist;
    ArrayList<Menu> menuArrayList;
    MenuAdapter menuAdapter;
    DanhMucAdapter danhMucAdapter;
    RecyclerView rv_dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        actionmenu();
        getmenu();
        getDanhmuc();
    }

    private void getmenu() {
            RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext()); // Tạo hàm thực hiện các pthuc' sẽ gửi lên server
            JsonArrayRequest  jsonArrayRequest = new JsonArrayRequest(Server.UrlMenu, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    if(response!= null)
                    {
                        int Id_menu = 0;
                        String HinhMenu="";
                        String TenMenu = "";
                        for (int i =  0;  i <response.length();i++) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(i);
                                Id_menu =jsonObject.getInt("id_menudoc");// ???
                                HinhMenu= jsonObject.getString("icon_menudoc");
                                TenMenu = jsonObject.getString("ten_menudoc");
                               menuArrayList.add(new Menu(Id_menu,HinhMenu,TenMenu));
                                //update lại bảng
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        menuAdapter.notifyDataSetChanged();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                }
            });
            requestQueue.add(jsonArrayRequest);

    }


    private void actionmenu() {
        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });
    }

    private void anhxa() {
        //anh xa
        drawerLayout=findViewById(R.id.drawer);
        listView = findViewById(R.id.Lv);
        navigationView= findViewById(R.id.navigation);
        img_menu= findViewById(R.id.profile_icon);
        rv_dm=findViewById(R.id.rv_dm);
        //rv danh muc
        Danhmucarraylist = new ArrayList<>();
        danhMucAdapter= new DanhMucAdapter(this, Danhmucarraylist);
        danhMucAdapter.notifyDataSetChanged();
        rv_dm.setLayoutManager(new GridLayoutManager(this,2));
        rv_dm.setNestedScrollingEnabled(false); // vo  hieu ho scroll
        rv_dm.setAdapter(danhMucAdapter);
        //list view menu doc
        menuArrayList = new ArrayList<>();
        menuAdapter= new MenuAdapter(menuArrayList,getApplicationContext());
        listView.setAdapter(menuAdapter);


    }

    private void getDanhmuc() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, Server.UrlDanhMuc, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        if (response!=null) {
                            int ID_Dm = 0;
                            String HinhDm="";
                            String Tendm = "";
                            for (int i = 0 ; i<response.length();i++)
                            {
                                try {
                                    JSONObject jsonObject = response.getJSONObject(i);
                                    ID_Dm= jsonObject.getInt("id");
                                    HinhDm=jsonObject.getString("hinh_dm");
                                    Tendm= jsonObject.getString("ten_dm");
                                    Danhmucarraylist.add(new Danhmuc(ID_Dm,HinhDm,Tendm));

                                }
                                catch (JSONException e) {
                                    Log.d("Exception", e.getMessage());
                                    e.printStackTrace();
                                }
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Log.d("listarray", Danhmucarraylist.size() + "");
                                   danhMucAdapter.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "Volley error", Toast.LENGTH_SHORT).show();
                        Log.d("loi", error.toString());
                    }
                });

        requestQueue.add(request);
    }
}