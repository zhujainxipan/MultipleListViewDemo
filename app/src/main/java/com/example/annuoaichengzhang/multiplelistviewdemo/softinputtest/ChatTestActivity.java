package com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChatTestActivity extends AppCompatActivity {

    private ListView mListView;
    private Demo2Adapter mAdapter;
    private List<Message> mMessageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mListView = (ListView) findViewById(R.id.post_lv);
        mMessageList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Message message = new Message();
            message.setType("item1");
            message.setContent("item1:" + i);
            mMessageList.add(message);
        }


        mAdapter = new Demo2Adapter(mMessageList, this);
        mListView.setAdapter(mAdapter);

        final EditText editText = (EditText) findViewById(R.id.edt);


        Button button = (Button) findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message message = new Message();
                String content = editText.getText().toString();
                if (content.isEmpty()) {
                    Toast.makeText(ChatTestActivity.this, "内容不能为空", Toast.LENGTH_LONG);
                } else {
                    message.setContent(content);
                    message.setState(Message.MSG_SENDING);
                    createReplayMsg(message);
                }
            }
        });
    }


    private void createReplayMsg(final Message message) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * (new Random().nextInt(3) + 1));
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mMessageList.add(message);
                            mAdapter.refresh(mMessageList);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }



}
