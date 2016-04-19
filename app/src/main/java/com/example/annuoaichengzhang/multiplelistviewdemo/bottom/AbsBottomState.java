package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by niehongtao on 16/4/19.
 */
public abstract class AbsBottomState {
    protected StateContext mStateContext;

    public void setStateContext(StateContext stateContext) {
        mStateContext = stateContext;
    }

    //状态1
    protected abstract void state1(LinearLayout linearLayout, Context context);


    //状态2
    protected abstract void state2(LinearLayout linearLayout, Context context);

    //状态3
    protected abstract void state3(LinearLayout linearLayout, Context context);


    //状态4
    protected abstract void state4(LinearLayout linearLayout, Context context);

}
