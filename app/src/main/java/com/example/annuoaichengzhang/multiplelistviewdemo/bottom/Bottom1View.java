package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

/**
 * Created by niehongtao on 16/4/21.
 */
public class Bottom1View extends BaseBottomView {

    private Button mView;

    public Bottom1View(Context context, Message message) {
        super(context, message);
    }

    @Override
    protected void initData(Message message) {
        mView.setText(message.getContent());
    }

    @Override
    protected void setListener(Message message) {
        mView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    @Override
    protected void findView() {
        mView = (Button) findViewById(R.id.bt1);
    }

    @Override
    protected int getViewLayoutId() {
        return R.layout.state1;
    }
}
