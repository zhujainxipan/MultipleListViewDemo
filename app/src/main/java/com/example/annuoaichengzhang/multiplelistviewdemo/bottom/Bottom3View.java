package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

/**
 * Created by niehongtao on 16/4/21.
 */
public class Bottom3View extends BaseBottomView {
    public Bottom3View(Context context, DemoEntity demoEntity) {
        super(context, demoEntity);
    }

    @Override
    protected void initData(DemoEntity demoEntity) {

    }

    @Override
    protected void setListener(DemoEntity demoEntity) {

    }

    @Override
    protected void findView() {

    }

    @Override
    protected int getViewLayoutId() {
        return R.layout.state3;
    }
}
