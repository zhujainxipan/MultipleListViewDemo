package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by niehongtao on 16/4/19.
 */
public class StateContext {
    public static final BottomState1 bottomState1 = new BottomState1();
    public static final BottomState2 bottomState2 = new BottomState2();
    public static final BottomState3 bottomState3 = new BottomState3();
    public static final BottomState4 bottomState4 = new BottomState4();

    private AbsBottomState mAbsBottomState;
    private Context mContext;


    protected LinearLayout linearLayout;

    public StateContext(LinearLayout linearLayout, Context context) {
        this.linearLayout = linearLayout;
        this.mContext = context;
    }

    public void setAbsBottomState(AbsBottomState absBottomState) {
        mAbsBottomState = absBottomState;
        this.mAbsBottomState.setStateContext(this);
    }

    public void state1() {
        this.mAbsBottomState.state1(linearLayout, mContext);
    }

    public void state2() {
        this.mAbsBottomState.state2(linearLayout, mContext);
    }

    public void state3() {
        this.mAbsBottomState.state3(linearLayout, mContext);
    }

    public void state4() {
        this.mAbsBottomState.state4(linearLayout, mContext);
    }


}
