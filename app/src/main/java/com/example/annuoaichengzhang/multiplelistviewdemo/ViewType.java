package com.example.annuoaichengzhang.multiplelistviewdemo;

/**
 * Created by niehongtao on 16/4/11.
 */
// 换用枚举
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
