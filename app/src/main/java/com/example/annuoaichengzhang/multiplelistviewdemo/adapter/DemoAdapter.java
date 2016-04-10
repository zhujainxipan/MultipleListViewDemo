package com.example.annuoaichengzhang.multiplelistviewdemo.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.DemoItemViewFactory;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.BaseItemView;

import java.util.List;

/**
 * Created by niehongtao on 16/4/9.
 */
public class DemoAdapter extends BaseAdapter{
    private List<DemoEntity> mDemoEntities;
    private Context mContext;

    public DemoAdapter(List<DemoEntity> demoEntities, Context context) {
        mDemoEntities = demoEntities;
        mContext = context;
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (mDemoEntities != null) {
            ret = mDemoEntities.size();
        }
        return ret;
    }

    @Override
    public int getItemViewType(int position) {
        String type = mDemoEntities.get(position).getType();
        if (type.equals("item1")) {
            return 0;
        } else if (type.equals("item2")) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        Object ret = null;
        if (mDemoEntities == null) {
            ret = mDemoEntities.get(position);
        }
        return ret;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(":nht...", "..." + convertView);
        int index = getItemViewType(position);
        switch (index) {
            case 0:
                convertView = bindItem1View(convertView);
                break;
            case 1:
                convertView = bindItem2View(convertView);
                break;
            case 2:
                convertView = bindItem3View(convertView);
                break;
        }
        ((BaseItemView)convertView).setData(mDemoEntities.get(position));
        return convertView;
    }

    private View bindItem3View(View convertView) {
        if (convertView == null) {
            convertView = DemoItemViewFactory.createBaseItemView("item3", mContext);
        }
        return convertView;
    }

    private View bindItem2View(View convertView) {
        if (convertView == null) {
            convertView = DemoItemViewFactory.createBaseItemView("item2", mContext);
        }
        return convertView;
    }

    private View bindItem1View(View convertView) {
        if (convertView == null) {
            convertView = DemoItemViewFactory.createBaseItemView("item1", mContext);
        }
        return convertView;
    }
}
