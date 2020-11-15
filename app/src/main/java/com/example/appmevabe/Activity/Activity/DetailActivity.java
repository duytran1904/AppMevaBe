package com.example.appmevabe.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appmevabe.R;

public class DetailActivity extends AppCompatActivity {
//        RecyclerView recyclerViewspmoi;
//    String url_ttb="http://192.168.1.18:8080/AppMevaBe/public/get_ttb";
//    SanphammoiAdapter spmoiAdapter;
//    ArrayList<Spmoi> spmoiArrayList;
//    CarouselView carouselView;
//    int[] sampleImages = {R.drawable.banner7, R.drawable.banner8, R.drawable.banner9,R.drawable.banner1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        //       StatusBarUtil.setTransparent(this);// set mau bg

//        carouselView = findViewById(R.id.carouselRecyclerView);
//        carouselView.setPageCount(sampleImages.length);
//        carouselView.setImageListener(imageListener);
//
//        anhxa();
//        getdata();

    }
    //    private void anhxa() {
//        recyclerViewspmoi=findViewById(R.id.rvnew);
//        spmoiArrayList = new ArrayList<>();
//        spmoiAdapter= new SanphammoiAdapter(this,spmoiArrayList);
//        spmoiAdapter.notifyDataSetChanged();
//        recyclerViewspmoi.setLayoutManager(new GridLayoutManager(this,3));
//        recyclerViewspmoi.setAdapter(spmoiAdapter);
//    }
//
//    ImageListener imageListener = new ImageListener() {
//        @Override
//        public void setImageForPosition(int position, ImageView imageView) {
//            imageView.setImageResource(sampleImages[position]);
//        }
//    };
//    private void getdata() {
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url_ttb, null,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//
//                        if (response!=null) {
//                            int ID = 0;
//                            String HinhSpmoi="";
//                            String TenSpmoi= "";
//                            int Giasp=0;
//
//                            for (int i = 0 ; i<response.length();i++)
//                            {
//                                try {
//                                    JSONObject jsonObject = response.getJSONObject(i);
//                                    ID = jsonObject.getInt("id");
//                                    HinhSpmoi= jsonObject.getString("hinh_spb");
//                                    TenSpmoi = jsonObject.getString("ten_spb");
//                                    Giasp= jsonObject.getInt("gia_spb");
//                                   spmoiArrayList.add(new Spmoi(ID,HinhSpmoi,TenSpmoi,Giasp));
//
//                                }
//                                catch (JSONException e) {
//                                    Log.d("Exception", e.getMessage());
//                                    e.printStackTrace();
//                                }
//                            }
//                            runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    Log.d("listarray", spmoiArrayList.size() + "");
//                                   spmoiAdapter.notifyDataSetChanged();
//                                }
//                            });
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getApplicationContext(), "Volley error", Toast.LENGTH_SHORT).show();
//                        Log.d("loi", error.toString());
//                    }
//                });
//
//        requestQueue.add(request);
//    }
}