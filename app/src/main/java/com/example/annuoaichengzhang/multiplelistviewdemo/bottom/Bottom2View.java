package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

/**
 * Created by niehongtao on 16/4/21.
 */
public class Bottom2View extends BaseBottomView {
    public Bottom2View(Context context, Message message) {
        super(context, message);
    }

    @Override
    protected void initData(Message message) {

    }

    @Override
    protected void setListener(Message message) {

    }

    @Override
    protected void findView() {

    }

    @Override
    protected int getViewLayoutId() {
        return R.layout.state2;
    }
}
