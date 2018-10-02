package com.example.admin.huflitlapandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Flag> arrayList;
    FlagAdapter flagAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list = findViewById(R.id.list);

        arrayList = Flag.initFlag();

        flagAdapter = new FlagAdapter(ListViewActivity.this,R.layout.layout_row,arrayList);

        list.setAdapter(flagAdapter);
    }
}
