package com.example.annuoaichengzhang.multiplelistviewdemo.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.DemoItemViewFactory;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.BaseItemView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niehongtao on 16/4/9.
 */
public class DemoAdapter extends BaseAdapter{
    private List<Message> mDemoEntities;
    private Context mContext;
//    private ArrayList<BaseItemView> mBaseItemViews = new ArrayList<>();

    public DemoAdapter(List<Message> demoEntities, Context context) {
        this.mDemoEntities = demoEntities;
        this.mContext = context;
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
        return DemoItemViewFactory.ViewType.getIndex(type);
    }

    @Override
    public int getViewTypeCount() {
        return DemoItemViewFactory.ViewType.values().length;
    }

    @Override
    public Object getItem(int position) {
        Object ret = null;
        if (mDemoEntities != null) {
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
        Message message = mDemoEntities.get(position);
//        message.setId(position);
        String type = message.getType();
        if (convertView == null) {
            Log.d(":nht...", "....convertView == null");
            convertView = DemoItemViewFactory.createBaseItemView(type, mContext);
        }
        ((BaseItemView)convertView).setData(message);

//        mBaseItemViews.add((BaseItemView)convertView);

        return convertView;
    }


// 此方案不好
//    public void refreshView(Message message) {
//        for (BaseItemView baseItemView : mBaseItemViews) {
//            if (message.getId().equals(baseItemView.getTokenId())) {
//                baseItemView.setData(message);
//                baseItemView.setTokenId(message.getId());
//            }
//
//        }

}
