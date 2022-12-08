package com.example.recycler_menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<modelmenu> menulist;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "menu1", Toast.LENGTH_SHORT).show();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Toast.makeText(this, "menu2", Toast.LENGTH_SHORT).show();
        menulist.add(new modelmenu(R.drawable.home,"Home"));

        Toast.makeText(this, "menu3", Toast.LENGTH_SHORT).show();
        MenuAdapter adapter = new MenuAdapter(this, menulist);
        recyclerView.setAdapter(adapter);
    }
}