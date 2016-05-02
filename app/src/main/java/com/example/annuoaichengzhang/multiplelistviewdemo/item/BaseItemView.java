package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

import butterknife.ButterKnife;

/**
 * Created by niehongtao on 16/4/9.
 */
public abstract class BaseItemView extends FrameLayout {
    protected Context mContext;


    public BaseItemView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }


    public BaseItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init();
    }

    /**
     * 需要把外界的数据传递进来
     * @param message
     */
    public void setData(Message message) {
        // 顺序必须这样，否则无法解决错位的问题
        setListener(message);
        initData(message);
    }

    final private void init() {
        View.inflate(mContext, getViewLayoutId(), this);
        ButterKnife.inject(this);
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
     * 返回布局id
     * @return
     */
    protected abstract int getViewLayoutId();
}
