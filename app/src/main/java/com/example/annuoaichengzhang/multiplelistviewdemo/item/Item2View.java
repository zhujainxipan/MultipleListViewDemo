package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;
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
    protected void initData(Message message) {
        mEtvPresentContent.setIsExpandFootViewAtBottom(false);
        mEtvPresentContent.setConvertText2(!message.isActive(), message.getContent());
    }

    @Override
    protected void setListener(final Message message) {
        // 展开收起控件的点击事件
        mEtvPresentContent.setOnStateChangeListener(new ExpandableTextView.OnStateChangeListener() {
            @Override
            public void setCloseClickDrawable(TextView button) {
                button.setBackgroundResource(R.mipmap.item_open);
                message.setIsActive(false);
            }

            @Override
            public void setOpenClickDrawable(TextView button) {
                button.setBackgroundResource(R.mipmap.item_close);
                message.setIsActive(true);
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
