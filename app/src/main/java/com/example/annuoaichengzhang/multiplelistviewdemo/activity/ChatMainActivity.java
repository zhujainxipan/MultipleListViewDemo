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
        mListView.addHeaderView(LayoutInflater.from(this).inflate(R.layout.item2_view, null));

        mDemoEntities = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Message message = new Message();
            message.setType("item2");
            String str = "dddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                    "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";

            message.setContent(str + i);
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
                Message message = mDemoEntities.get(10);

                message.setContent("ffsfffsdfdsfdfdfdfdfdfdfdfdfdfdfdsfdfdfdfdsfsdfdfsfsdfsd");
                updateSingleRow(message);
            }
        });


    }

    // 方案3：最佳方案
    private void updateSingleRow(Message message) {
        for (int i = 0; i < mListView.getChildCount(); i++) {
            View view =  mListView.getChildAt(i);
            if (view instanceof BaseItemView && ((BaseItemView)view).getPosition() == message.getPosition()) {
                mDemoAdapter.getView(message.getPosition(), view, mListView);
                break;
        }
    }


    // 方案2：谷歌推荐的方案。此方案仍存在问题，并不能完全解决问题，在分页加载的时候
//    private void updateSingleRow(Message tempMessage) {
//        int start = mListView.getFirstVisiblePosition();
//        int end = mListView.getLastVisiblePosition();
//
////        start = start < 0 ? 0 : start;
//
//        Log.d("start...", "start:   " + start + "end:   " + end  + "conut:   " + mDemoAdapter.getCount());
//
//        for (int i = start, j = end; i <= j; i++) {
//
//            if (i > mDemoAdapter.getCount() - 1) {
//                return;
//            }
//            Message message = (Message) mDemoAdapter.getItem(i);
//            if (tempMessage.getId() == message.getId()) {
//                BaseItemView itemView = (BaseItemView) mListView.getChildAt(i - start + mListView.getHeaderViewsCount());
//                itemView.setData(tempMessage);
//                break;
//            }
//        }

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
