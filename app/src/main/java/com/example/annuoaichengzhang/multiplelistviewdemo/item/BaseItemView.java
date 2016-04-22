package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

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
     * @param demoEntity
     */
    public void setData(DemoEntity demoEntity) {
        initData(demoEntity);
        setListener(demoEntity);
    }

    final private void init() {
        View.inflate(mContext, getViewLayoutId(), this);
        ButterKnife.inject(this);
    }

    /**
     * 初始化数据
     * @param demoEntity
     */
    protected abstract void initData(DemoEntity demoEntity);

    /**
     * 初始化点击
     * @param demoEntity
     */
    protected abstract void setListener(DemoEntity demoEntity);

    /**
     * 返回布局id
     * @return
     */
    protected abstract int getViewLayoutId();
}
