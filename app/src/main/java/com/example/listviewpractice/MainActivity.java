package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.list);
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Apple");
        arr.add("Ball");
        arr.add("Cat");
        arr.add("Dog");
        arr.add("Elephant");
        arr.add("Fish");



        ArrayAdapter adapter1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        list.setAdapter(adapter1);
    }
}