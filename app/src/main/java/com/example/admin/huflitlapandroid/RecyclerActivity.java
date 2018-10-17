package com.example.admin.huflitlapandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private  RecyclerView.LayoutManager mLayoutManager;

    private ArrayList<Songs> songList;
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        mRecyclerView = findViewById(R.id.RecyclerView);

//        hinh 6.1
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

//        hinh 6.2
//        mLayoutManager = new GridLayoutManager(this,2);
//        mRecyclerView.setLayoutManager(mLayoutManager);

//        hinh 6.3
//        mLayoutManager = new LinearLayoutManager(RecyclerActivity.this,LinearLayoutManager.HORIZONTAL,false);
//        mRecyclerView.setLayoutManager(mLayoutManager);

        songList = Songs.init();

        songAdapter = new SongAdapter(RecyclerActivity.this,R.layout.layout_item,songList);

        mRecyclerView.setAdapter(songAdapter);
    }
}
