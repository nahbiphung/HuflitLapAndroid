package com.example.admin.huflitlapandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Images> arrayList;
    ImagesAdapter imagesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        arrayList = Images.init();

        imagesAdapter = new ImagesAdapter(MainActivity.this,R.layout.layout_cell,arrayList);

        gridView.setAdapter(imagesAdapter);
    }
}
