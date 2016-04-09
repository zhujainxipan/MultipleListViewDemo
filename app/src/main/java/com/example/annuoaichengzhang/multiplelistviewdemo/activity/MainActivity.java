package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.adapter.DemoAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        ListView listView = (ListView) findViewById(R.id.post_lv);
        List<DemoEntity> demoEntities = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item1");
            demoEntity.setContent("item1:" + i);
            demoEntities.add(demoEntity);
        }

        for (int i = 0; i < 100; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item2");
            demoEntity.setContent("item2:" + i);
            demoEntities.add(demoEntity);
        }

        for (int i = 0; i < 100; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item3");
            demoEntity.setContent("item3:" + i);
            demoEntities.add(demoEntity);
        }

        DemoAdapter demoAdapter = new DemoAdapter(demoEntities, this);
        listView.setAdapter(demoAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
