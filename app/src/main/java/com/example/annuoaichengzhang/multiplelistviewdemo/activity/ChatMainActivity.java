package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.adapter.DemoAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.BaseItemView;

import java.util.ArrayList;
import java.util.List;

public class ChatMainActivity extends AppCompatActivity {

    private ListView mListView;
    private DemoAdapter mDemoAdapter;
    private List<Message> mDemoEntities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mListView = (ListView) findViewById(R.id.post_lv);

        mListView.addHeaderView(LayoutInflater.from(this).inflate(R.layout.item3_view, null));

        mDemoEntities = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Message message = new Message();
//            message.setId(i);
            message.setType("item1");
            message.setContent("item1:" + i);
            mDemoEntities.add(message);
        }

//        for (int i = 10; i < 20; i++) {
//            Message message = new Message();
//            message.setType("item2");
//            message.setContent("item2:" + i);
//            mDemoEntities.add(message);
//        }
//
//        for (int i = 20; i < 30; i++) {
//            Message message = new Message();
//            message.setType("item3");
//            message.setContent("item3:" + i);
//            mDemoEntities.add(message);
//        }

        mDemoAdapter = new DemoAdapter(mDemoEntities, this);
        mListView.setAdapter(mDemoAdapter);
        mListView.setSelection(mDemoAdapter.getCount());

        findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message message = mDemoEntities.get(1);
                message.setContent("ffsfffsdfdsfdfdfdfdfdfdfdfdfdfdfdsfdfdfdfdsfsdfdfsfsdfsd");
                updateSingleRow(message);
            }
        });


    }



    private void updateSingleRow(Message tempMessage) {
            int start = mListView.getFirstVisiblePosition();

        Log.d("start", start + "first" + mListView.getFirstVisiblePosition() + "last" + mListView.getLastVisiblePosition());
            for (int i = start, j = mListView.getLastVisiblePosition(); i <= j; i++) {
                Message message = (Message) mDemoAdapter.getItem(i);
                if (message == null) {
                    Log.d("id..", tempMessage.getId() + "");
                }

                Log.d("id1..", tempMessage.getId() +  "fsfsf" + message.getId());

                if (tempMessage.getId() == message.getId()) {
                    View view = mListView.getChildAt(i  - start + mListView.getHeaderViewsCount());
                    mDemoAdapter.getView(i, view, mListView);
                    break;
                }
            }

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
