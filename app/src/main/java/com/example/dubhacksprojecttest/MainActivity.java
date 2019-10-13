package com.example.dubhacksprojecttest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);

        list.add("event 1" + "\n" + "time 1" + "\n" + "location 1");
        list.add("event 2" + "\n" + "time 2" + "\n" + "location 2");
        list.add("event 3" + "\n" + "time 3" + "\n" + "location 3");
        list.add("event 4" + "\n" + "time 4" + "\n" + "location 4");
        list.add("event 5" + "\n" + "time 5" + "\n" + "location 5");
        list.add("event 6" + "\n" + "time 6" + "\n" + "location 6");
        list.add("event 7" + "\n" + "time 7" + "\n" + "location 7");
        list.add("event 8" + "\n" + "time 8" + "\n" + "location 8");
        list.add("event 9" + "\n" + "time 9" + "\n" + "location 9");
        list.add("event 10" + "\n" + "time 10" + "\n" + "location 10");
        list.add("event 11" + "\n" + "time 11" + "\n" + "location 11");
        list.add("event 12" + "\n" + "time 12" + "\n" + "location 12");
        list.add("event 13" + "\n" + "time 13" + "\n" + "location 13");

        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

    }
}
