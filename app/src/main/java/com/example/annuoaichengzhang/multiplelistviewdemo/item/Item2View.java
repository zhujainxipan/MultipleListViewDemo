package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;
import com.example.annuoaichengzhang.multiplelistviewdemo.view.ExpandableTextView;

import butterknife.InjectView;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Item2View extends BaseItemView {
    @InjectView(R.id.etv_present_content)
    ExpandableTextView mEtvPresentContent;

    public Item2View(Context context) {
        super(context);
    }

    public Item2View(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initData(DemoEntity demoEntity) {
        String str = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
        mEtvPresentContent.setConvertText2(!demoEntity.isActive(), str);
    }

    @Override
    protected void setListener(final DemoEntity demoEntity) {
        // 展开收起控件的点击事件
        mEtvPresentContent.setOnStateChangeListener(new ExpandableTextView.OnStateChangeListener() {
            @Override
            public void setCloseClickDrawable(TextView button) {
                button.setBackgroundResource(R.mipmap.item_open);
                demoEntity.setIsActive(false);
            }

            @Override
            public void setOpenClickDrawable(TextView button) {
                button.setBackgroundResource(R.mipmap.item_close);
                demoEntity.setIsActive(true);
            }
        });

    }


    @Override
    protected int getViewLayoutId() {
        return R.layout.item2_view;
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }
}
