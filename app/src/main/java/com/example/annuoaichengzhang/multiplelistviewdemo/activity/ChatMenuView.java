package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;

/**
 * Created by niehongtao on 16/8/22.
 */
public class ChatMenuView extends LinearLayout {

    private TextView mTv1;
    private TextView mTv2;
    private TextView mTv3;
    private TextView mTv4;
    PopupWindow mpopupWindow;


    public ChatMenuView(Context context) {
        super(context);
        init(context);
    }

    public ChatMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        View.inflate(context, R.layout.view_chat_menu, this);
        // 取到布局中的控件
        mTv1 = (TextView) findViewById(R.id.tv_test1);
        mTv2 = (TextView) findViewById(R.id.tv_test2);
        mTv3 = (TextView) findViewById(R.id.tv_test3);
        mTv4 = (TextView) findViewById(R.id.tv_test4);
        setListener();
    }

    private void setListener() {
        mTv1.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                showSubMenu(v);
                return false;
            }
        });


        mTv2.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                showSubMenu(v);
                return false;
            }
        });


        mTv3.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                showSubMenu(v);
                return false;
            }
        });


    }

    private void showSubMenu(View anchor) {
        View contentV = initSubContentMenu();
        if (mpopupWindow != null) {
            mpopupWindow.dismiss();
        }

        mpopupWindow = new PopupWindow(getContext());
        mpopupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        mpopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mpopupWindow.setOutsideTouchable(true);
        mpopupWindow.setFocusable(false);
        mpopupWindow.setBackgroundDrawable(new BitmapDrawable());
        mpopupWindow.setContentView(contentV);

        // 计算这个PopupWindow的显示位置
        int[] location = new int[2];
        anchor.getLocationOnScreen(location);
        int y = getHeight();
        int x = (location[0] + anchor.getWidth() / 2) - contentV.getMeasuredWidth() / 2;
        mpopupWindow.showAtLocation(anchor, Gravity.BOTTOM | Gravity.LEFT, x, y);

    }

    private View initSubContentMenu() {
        return LayoutInflater.from(getContext()).inflate(R.layout.layout_menu_popup, null);
    }


}
