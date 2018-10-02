package com.example.admin.huflitlapandroid;

import java.util.ArrayList;

public class Flag {
    int id;
    String name;

    public Flag(int id,String name){
        this.id = id;
        this.name = name;
    }

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

    public  static ArrayList initFlag(){
        ArrayList<Flag> arrayList = new ArrayList<>();
        arrayList.add(new Flag(R.drawable.hinh1,"VN"));
        arrayList.add(new Flag(R.drawable.hinh1,"Ecuador"));
        arrayList.add(new Flag(R.drawable.hinh1,"Estonia"));
        arrayList.add(new Flag(R.drawable.hinh1,"France"));
        arrayList.add(new Flag(R.drawable.hinh1,"Italy"));
        arrayList.add(new Flag(R.drawable.hinh1,"Laos"));
        arrayList.add(new Flag(R.drawable.hinh2,"VN"));
        arrayList.add(new Flag(R.drawable.hinh2,"Ecuador"));
        arrayList.add(new Flag(R.drawable.hinh2,"Estonia"));
        arrayList.add(new Flag(R.drawable.hinh2,"France"));
        arrayList.add(new Flag(R.drawable.hinh2,"Italy"));
        arrayList.add(new Flag(R.drawable.hinh2,"Laos"));
        return arrayList;
    }
}
