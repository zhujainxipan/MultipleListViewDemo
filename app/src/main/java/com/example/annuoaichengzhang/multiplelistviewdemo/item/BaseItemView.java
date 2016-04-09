package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

/**
 * Created by niehongtao on 16/4/9.
 */
public abstract class BaseItemView extends FrameLayout {
    protected Context mContext;
    protected DemoEntity mDemoEntity;

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
     * @param demoEntity
     */
    public void setDemoEntity(DemoEntity demoEntity) {
        this.mDemoEntity = demoEntity;
        setListener();
        initData();
    }

    final private void init() {
        View.inflate(mContext, getViewLayoutId(), this);
        initView();
    }

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 初始化点击
     */
    protected abstract void setListener();

    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 返回布局id
     * @return
     */
    protected abstract int getViewLayoutId();

}
