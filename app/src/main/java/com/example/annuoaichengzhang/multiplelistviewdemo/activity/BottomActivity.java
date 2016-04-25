package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.bottom.BottomViewFactory;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
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

        final DemoEntity demoEntity = new DemoEntity();
        demoEntity.setContent("111111");

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.bottom_container);

        findViewById(R.id.btn_bottom1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViews();
                linearLayout.addView(BottomViewFactory.createBottomView("bottom1", BottomActivity.this, demoEntity));
            }
        });

        findViewById(R.id.btn_bottom2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViews();
                linearLayout.addView(BottomViewFactory.createBottomView("bottom2", BottomActivity.this, demoEntity));
            }
        });

        findViewById(R.id.btn_bottom3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViews();
                linearLayout.addView(BottomViewFactory.createBottomView("bottom3", BottomActivity.this, demoEntity));
            }
        });


    }

}
