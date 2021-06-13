package com.example.recyclerview191167;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Recycler_Adapter recycler_adapter;

    String [] students = {"Ali", "Usman", "SanaUllah", "Salman","Ahmad","Zain", "Zaid", "Hashim", "Qasim","Asim"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerView);
        recycler_adapter = new Recycler_Adapter(students, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(recycler_adapter);


    }
}