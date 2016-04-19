package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;

/**
 * Created by niehongtao on 16/4/19.
 */
public class BottomState2 extends AbsBottomState {
    @Override
    protected void state1(LinearLayout linearLayout, Context context) {

    }

    @Override
    protected void state2(LinearLayout linearLayout, Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.state2, null);
        linearLayout.removeAllViews();
        linearLayout.addView(view);

        view.findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomState2.super.mStateContext.state3();
            }
        });


    }

    @Override
    protected void state3(LinearLayout linearLayout, Context context) {

    }

    @Override
    protected void state4(LinearLayout linearLayout, Context context) {

    }
}
