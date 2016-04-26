package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;

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
    protected void initData(DemoEntity demoEntity) {
        mCk.setChecked(demoEntity.isChecked());
        mCk.setText(demoEntity.getContent());
    }

    @Override
    protected void setListener(final DemoEntity demoEntity) {
        mCk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                demoEntity.setIsChecked(isChecked);
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
