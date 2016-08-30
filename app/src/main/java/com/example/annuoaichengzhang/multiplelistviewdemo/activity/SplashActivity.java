package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest.ChatTestActivity;
import com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest.ClickTestActivity;

public class SplashActivity extends AppCompatActivity {

    private boolean isShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        findViewById(R.id.mt_lv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, ChatMainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.lv_bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, BottomActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.lv_softinputtest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, ChatTestActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.lv_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, ClickTestActivity.class);
                startActivity(intent);
            }
        });

        ChatMenuView menuView = (ChatMenuView) findViewById(R.id.mv_test);
        menuView.setIChatViewListener(new ChatMenuView.IChatViewListener() {
            @Override
            public void toX() {
                Intent intent = new Intent(SplashActivity.this, BottomActivity.class);
                startActivity(intent);
            }
        });




    }

}
