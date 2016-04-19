package com.example.annuoaichengzhang.multiplelistviewdemo.item;

import android.content.Context;


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



    public enum ViewType {
        ITEM1(0, "item1"),
        ITEM2(1, "item2"),
        ITEM3(2, "item3");
        private int index;
        private String viewType;

        ViewType(int index, String viewType) {
            this.index = index;
            this.viewType = viewType;
        }

        // 普通方法
        public static int getIndex(String viewType) {
            for (ViewType v : ViewType.values()) {
                if (v.getViewType().equals(viewType)) {
                    return v.index;
                }
            }
            return -1;
        }

        // get set方法
        public String getViewType() {
            return viewType;
        }


        public int getIndex() {
            return index;
        }


    }

}
