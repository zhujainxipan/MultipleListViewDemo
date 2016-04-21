package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

/**
 * Created by niehongtao on 16/4/9.
 */
public abstract class BaseBottomView extends FrameLayout {
    protected Context mContext;


    public BaseBottomView(Context context, DemoEntity demoEntity) {
        super(context);
        this.mContext = context;
        init(demoEntity);
    }

    final private void init(DemoEntity demoEntity) {
        View.inflate(mContext, getViewLayoutId(), this);
        findView();
        initData(demoEntity);
        setListener(demoEntity);
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
     * 初始化视图
     */
    protected abstract void findView();

    /**
     * 返回布局id
     * @return
     */
    protected abstract int getViewLayoutId();
}
