package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

import butterknife.InjectView;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Item3View extends BaseItemView {

    @InjectView(R.id.content_tv)
    TextView mContentTv;

    public Item3View(Context context) {
        super(context);
    }

    public Item3View(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initData(DemoEntity demoEntity) {
        mContentTv.setText(demoEntity.getContent());
    }

    @Override
    protected void setListener(final DemoEntity demoEntity) {
        mContentTv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Item3View.super.mContext, demoEntity.getContent(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected int getViewLayoutId() {
        return R.layout.item3_view;
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }
}
