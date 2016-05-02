package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;


/**
 * Created by niehongtao on 16/4/9.
 */
public class BottomViewFactory {

    public static synchronized BaseBottomView createBottomView(String type, Context context, Message message) {
        BaseBottomView baseBottomView = null;
        if (type.equals("bottom1")) {
            baseBottomView = new Bottom1View(context, message);
        } else if (type.equals("bottom2")) {
            baseBottomView = new Bottom2View(context, message);
        } else if (type.equals("bottom3")) {
            baseBottomView = new Bottom3View(context, message);
        }
        return baseBottomView;
    }
}
