package com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.adapter.DemoAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

import java.util.ArrayList;
import java.util.List;

public class ChatTestActivity extends AppCompatActivity {

    private ListView mListView;
    private Demo2Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mListView = (ListView) findViewById(R.id.post_lv);
        List<DemoEntity> demoEntities = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item1");
            demoEntity.setContent("item1:" + i);
            demoEntities.add(demoEntity);
        }


        mAdapter = new Demo2Adapter(demoEntities, this);
        mListView.setAdapter(mAdapter);

        EditText editText = (EditText) findViewById(R.id.edt);

        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // mInputMethodManager.toggleSoftInput(1,
                    // InputMethodManager.RESULT_UNCHANGED_HIDDEN);
                    toTouchMode(v);
                }
                return false;
            }
        });


    }


    void toTouchMode(View v) {
        v.requestFocus();
        v.setFocusable(true);
        v.setFocusableInTouchMode(true);

        InputMethodManager mInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        mInputMethodManager.showSoftInput(v, 0);

        mListView.setSelection(mAdapter.getCount());

    }


}
