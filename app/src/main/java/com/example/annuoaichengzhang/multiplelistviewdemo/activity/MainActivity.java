package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.adapter.DemoAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private DemoAdapter mDemoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        for (int i = 0; i < 10; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item2");
            demoEntity.setContent("item2:" + i);
            demoEntities.add(demoEntity);
        }

        for (int i = 0; i < 10; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setType("item3");
            demoEntity.setContent("item3:" + i);
            demoEntities.add(demoEntity);
        }

        mDemoAdapter = new DemoAdapter(demoEntities, this);
        mListView.setAdapter(mDemoAdapter);



        mListView.setSelection(mDemoAdapter.getCount());


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

        mListView.setSelection(mDemoAdapter.getCount());

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
