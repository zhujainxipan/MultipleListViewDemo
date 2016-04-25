package com.example.annuoaichengzhang.multiplelistviewdemo.bottom2;

/**
 * Created by niehongtao on 16/4/22.
 */
public class BottomContext {
    public static BottomState b1 = new BottomState1();
    public static BottomState b2 = new BottomState2();
    public static BottomState b3 = new BottomState3();

    private BottomState mBottomState;

    public BottomState getBottomState() {
        return mBottomState;
    }

    public void setBottomState(BottomState bottomState) {
        mBottomState = bottomState;
    }

    public void click() {
        this.mBottomState.updateView();
    }
}
