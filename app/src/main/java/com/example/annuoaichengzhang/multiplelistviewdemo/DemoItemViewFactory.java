package com.example.annuoaichengzhang.multiplelistviewdemo;

import android.content.Context;

import com.example.annuoaichengzhang.multiplelistviewdemo.item.BaseItemView;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.Item1View;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.Item2View;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.Item3View;

/**
 * Created by niehongtao on 16/4/9.
 */
public class DemoItemViewFactory {

    public static synchronized BaseItemView createBaseItemView(String type, Context context) {
        BaseItemView baseItemView = null;
        if (type.equals(ViewType.ITEM1.getViewType())) {
            baseItemView = new Item1View(context);
        } else if (type.equals(ViewType.ITEM2.getViewType())) {
            baseItemView = new Item2View(context);
        } else {
            baseItemView = new Item3View(context);
        }
        return baseItemView;
    }
}
