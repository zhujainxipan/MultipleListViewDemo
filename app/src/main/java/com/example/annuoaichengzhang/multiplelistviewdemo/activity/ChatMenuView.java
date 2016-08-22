package com.example.annuoaichengzhang.multiplelistviewdemo.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
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
    View mParentView;


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

        mTv1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showSubMenu(v);
            }
        });
    }

    private void showSubMenu(View anchor) {
        View contentV = initSubContentMenu();
        if (mpopupWindow != null) {
            mpopupWindow.dismiss();
        }
//        mpopupWindow = new PopupWindow(contentV, contentV.getMeasuredWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
//        mpopupWindow.setBackgroundDrawable(new BitmapDrawable());
//        mpopupWindow.setFocusable(false);
//        mpopupWindow.setOutsideTouchable(true);
//
//        int[] location = new int[2];
//        anchor.getLocationOnScreen(location);
//        int y = getHeight();
//        int x = (location[0] + anchor.getWidth() / 2) - contentV.getMeasuredWidth() / 2;
//        mpopupWindow.showAtLocation(anchor, Gravity.BOTTOM | Gravity.LEFT, x, y);

        mpopupWindow = new PopupWindow();
        mpopupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        mpopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mpopupWindow.setOutsideTouchable(true);
        mpopupWindow.setTouchable(true);
        mpopupWindow.setFocusable(true);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        // 某些博客说，当没有设置Background的时候，无论是触摸其他空白区还是back键都无法dismiss()掉这个PopupWindow
        // 但我注释掉这段代码能dismiss(),有可能是个Bug,已经得google到修复
        mpopupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(),bitmap));
        mpopupWindow.setContentView(contentV);

        // 计算这个PopupWindow的显示位置
        int[] screen_pos = new int[2];
        anchor.getLocationOnScreen(screen_pos);
        Rect anchor_rect = new Rect(screen_pos[0], screen_pos[1], screen_pos[0] + anchor.getWidth(), screen_pos[1] + anchor.getHeight());
        contentV.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int contentViewWidth = contentV.getMeasuredWidth();
        int contentViewHeight = contentV.getMeasuredHeight();
        int position_x = anchor_rect.centerX() - (contentViewWidth / 2);
        int position_y = anchor_rect.bottom - (anchor_rect.height() / 2);

        mpopupWindow.showAtLocation(anchor, Gravity.NO_GRAVITY, position_x, position_y);
    }

    private View initSubContentMenu() {
        return LayoutInflater.from(getContext()).inflate(R.layout.layout_menu_popup, null);
    }


    public void setParent(View p) {
        mParentView = p;
    }

}
