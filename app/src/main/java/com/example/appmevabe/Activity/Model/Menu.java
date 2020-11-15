package com.example.appmevabe.Activity.Model;

public class Menu {
    int id;
    String  hinh_menu;
    String ten_menu;

    public Menu(int id, String hinh_menu, String ten_menu) {
        this.id = id;
        this.hinh_menu = hinh_menu;
        this.ten_menu = ten_menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHinh_menu() {
        return hinh_menu;
    }

    public void setHinh_menu(String hinh_menu) {
        this.hinh_menu = hinh_menu;
    }

    public String getTen_menu() {
        return ten_menu;
    }

    public void setTen_menu(String ten_menu) {
        this.ten_menu = ten_menu;
    }
}
