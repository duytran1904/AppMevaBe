package com.example.appmevabe.Activity.Model;

public class Danhmuc {
    int id_dm;
    String hinh_dm,ten_dm;

    public Danhmuc(int id_dm, String hinh_dm, String ten_dm) {
        this.id_dm = id_dm;
        this.hinh_dm = hinh_dm;
        this.ten_dm = ten_dm;
    }

    public int getId_dm() {
        return id_dm;
    }

    public void setId_dm(int id_dm) {
        this.id_dm = id_dm;
    }

    public String getHinh_dm() {
        return hinh_dm;
    }

    public void setHinh_dm(String hinh_dm) {
        this.hinh_dm = hinh_dm;
    }

    public String getTen_dm() {
        return ten_dm;
    }

    public void setTen_dm(String ten_dm) {
        this.ten_dm = ten_dm;
    }
}
