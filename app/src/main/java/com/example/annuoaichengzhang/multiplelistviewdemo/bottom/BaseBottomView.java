package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

/**
 * Created by niehongtao on 16/4/9.
 */
public abstract class BaseBottomView extends FrameLayout {
    protected Context mContext;


    public BaseBottomView(Context context, Message message) {
        super(context);
        this.mContext = context;
        init(message);
    }

    final private void init(Message message) {
        View.inflate(mContext, getViewLayoutId(), this);
        findView();
        initData(message);
        setListener(message);
    }

    /**
     * 初始化数据
     * @param message
     */
    protected abstract void initData(Message message);

    /**
     * 初始化点击
     * @param message
     */
    protected abstract void setListener(Message message);

    /**
     * 初始化视图
     */
    protected abstract void findView();

    /**
     * 返回布局id
     * @return
     */
    protected abstract int getViewLayoutId();
}
