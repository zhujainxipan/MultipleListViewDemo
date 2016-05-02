package com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.adapter.DemoAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

import java.util.ArrayList;
import java.util.List;

public class ChatTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        ListView listView = (ListView) findViewById(R.id.post_lv);
        List<DemoEntity> demoEntities = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item1");
            demoEntity.setContent("item1:" + i);
            demoEntities.add(demoEntity);
        }


        Demo2Adapter adapter = new Demo2Adapter(demoEntities, this);
        listView.setAdapter(adapter);

    }

}
