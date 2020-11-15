package com.example.appmevabe.Activity.Model;

public class Spmoi {
    Integer id_sp;
    String hinh_sp;
    String ten_sp;
    Integer gia_sp;

    public Spmoi(Integer id_sp, String hinh_sp, String ten_sp, Integer gia_sp) {
        this.id_sp = id_sp;
        this.hinh_sp = hinh_sp;
        this.ten_sp = ten_sp;
        this.gia_sp = gia_sp;
    }

    public Integer getId_sp() {
        return id_sp;
    }

    public void setId_sp(Integer id_sp) {
        this.id_sp = id_sp;
    }

    public String getHinh_sp() {
        return hinh_sp;
    }

    public void setHinh_sp(String hinh_sp) {
        this.hinh_sp = hinh_sp;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public Integer getGia_sp() {
        return gia_sp;
    }

    public void setGia_sp(Integer gia_sp) {
        this.gia_sp = gia_sp;
    }
}
