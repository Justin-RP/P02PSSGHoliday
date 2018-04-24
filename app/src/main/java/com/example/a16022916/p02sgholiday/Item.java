package com.example.a16022916.p02sgholiday;

/**
 * Created by 16022916 on 24/4/2018.
 */

public class Item {
    private String name;
    private String date;
    private int img;
    private int imgType;

    public Item(String name, String date, int img, int imgType) {
        this.name = name;
        this.date = date;
        this.img = img;
        this.imgType = imgType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImgType() {
        return imgType;
    }

    public void setImgType(int imgType) {
        this.imgType = imgType;
    }
}
