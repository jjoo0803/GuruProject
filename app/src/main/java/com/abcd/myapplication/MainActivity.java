package com.abcd.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    static final String[] LIST_MENU = {"LIST1","LIST2","LIST3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner

        Spinner monthSpinner = (Spinner)findViewById(R.id.menu);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this, R.array.date_month, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,LIST_MENU);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
