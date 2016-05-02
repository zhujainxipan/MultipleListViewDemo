package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

import butterknife.InjectView;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Item1View extends BaseItemView {


    @InjectView(R.id.ck)
    CheckBox mCk;

    public Item1View(Context context) {
        super(context);
    }

    public Item1View(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void initData(Message message) {
        mCk.setChecked(message.isChecked());
        mCk.setText(message.getContent());
    }

    @Override
    protected void setListener(final Message message) {
        mCk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                message.setIsChecked(isChecked);
            }
        });
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
