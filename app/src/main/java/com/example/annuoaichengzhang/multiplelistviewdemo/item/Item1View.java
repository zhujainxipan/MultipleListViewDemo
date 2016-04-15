package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Item1View extends BaseItemView {

    private TextView mTv;

    public Item1View(Context context) {
        super(context);
    }

    public Item1View(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initData(DemoEntity demoEntity) {
        mTv.setText(demoEntity.getContent());
    }

    @Override
    protected void setListener(final DemoEntity demoEntity) {
        mTv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Item1View.super.mContext, demoEntity.getContent(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void initView() {
        mTv = (TextView) findViewById(R.id.content_tv);
    }

    @Override
    protected int getViewLayoutId() {
        return R.layout.item1_view;
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);

    }
}
