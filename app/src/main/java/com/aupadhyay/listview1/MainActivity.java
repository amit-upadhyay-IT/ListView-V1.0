package com.aupadhyay.listview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ImageAdapter imageAdapter;

    public void initViews()
    {
        listView = (ListView) findViewById(R.id.listView);
        imageAdapter = new ImageAdapter(this);
        listView.setAdapter(imageAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
}
