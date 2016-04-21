package com.example.annuoaichengzhang.multiplelistviewdemo.bottom;

import android.content.Context;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;
import java.util.HashMap;


/**
 * Created by niehongtao on 16/4/9.
 */
public class BottomViewFactory {
    private static HashMap<String, BaseBottomView> mHashMap = new HashMap();
    private DemoEntity mDemoEntity;

    public BottomViewFactory(DemoEntity demoEntity, Context context) {
        initMap(demoEntity, context);
    }

    private void initMap(DemoEntity demoEntity, Context context) {
        mHashMap.put("1", new Bottom1View(context, demoEntity));
        mHashMap.put("2", new Bottom2View(context, demoEntity));
        mHashMap.put("3", new Bottom3View(context, demoEntity));
    }

    public static synchronized BaseBottomView createBottomView(String type) {
        return mHashMap.get(type);
    }
}
