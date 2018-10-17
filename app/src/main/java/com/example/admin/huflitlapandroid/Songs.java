package com.example.admin.huflitlapandroid;

import java.util.ArrayList;

public class Songs {
    private String name, singer,year;
    private int pic,rank;

    public  Songs(String name,String singer, String year,int pic, int rank){
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.pic = pic;
        this.rank = rank;
    }

    public Songs(String name,String singer,int rank,int pic){
        this.name = name;
        this.singer = singer;
        this.rank = rank;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public String getYear() {
        return year;
    }

    public int getPic() {
        return pic;
    }

    public int getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public static ArrayList<Songs> init(){
        String[] names = {"I Took A Pill In Tbiza", "7 Years","Pillow Talk", "Work From Home","Never Foget You","Dont Let Me Down"};
        String[] singers = {"Moke Posner", "Lukes Gramham","Zayn","Fifth Harmony","Zara Larsson $amp; MNEK","The Chainsmokers"};

        int[] pics = {
                R.drawable.hinh1,
                R.drawable.hinh2,
                R.drawable.hinh2,
                R.drawable.hinh1,
                R.drawable.hinh1,
                R.drawable.hinh2
        };

        ArrayList<Songs> arrayList = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            Songs song = new Songs(names[i],singers[i],i+1,pics[i]);
            arrayList.add(song);
        }
        return arrayList;
    }
}
