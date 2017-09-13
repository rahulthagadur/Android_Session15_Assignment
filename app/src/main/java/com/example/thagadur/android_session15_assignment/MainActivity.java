package com.example.thagadur.android_session15_assignment;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //    Declare the objects for the classes and initialise if needed
    ArrayList<DataList> vNames;
    FloatingActionButton fab;
    RecyclerView recyclerView;
    Context mContext;
    String name[] = {"Cupcake", "Donut", "Eclairs", "Froyo", "Gingerbread", "HoneyComb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initialising the array list
        vNames = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            vNames.add(new DataList(name[i]));

        }
//      Setting the content to recycler View
        recyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        CustomAdapter customAdapter = new CustomAdapter(mContext, vNames);
        recyclerView.setAdapter(customAdapter);
    }

    //          Menu options created
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
