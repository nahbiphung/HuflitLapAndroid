package com.example.admin.huflitlapandroid;

import java.util.ArrayList;

public class Images {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Images(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static ArrayList<Images> init(){
        ArrayList<Images> arrayList = new ArrayList<>();
        arrayList.add( new Images(R.drawable.hinh1,"Image 01"));
        arrayList.add( new Images(R.drawable.hinh2,"Image 02"));
        arrayList.add( new Images(R.drawable.hinh2,"Image 03"));
        arrayList.add( new Images(R.drawable.hinh1,"Image 04"));
        arrayList.add( new Images(R.drawable.hinh1,"Image 05"));
        arrayList.add( new Images(R.drawable.hinh2,"Image 06"));
        arrayList.add( new Images(R.drawable.hinh2,"Image 07"));
        arrayList.add( new Images(R.drawable.hinh1,"Image 09"));
        arrayList.add( new Images(R.drawable.hinh1,"Image 09"));
        arrayList.add( new Images(R.drawable.hinh2,"Image 10"));
        return  arrayList;
    }
}
