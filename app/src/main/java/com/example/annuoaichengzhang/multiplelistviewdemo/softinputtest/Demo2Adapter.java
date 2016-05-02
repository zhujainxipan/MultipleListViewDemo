package com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.DemoEntity;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.BaseItemView;
import com.example.annuoaichengzhang.multiplelistviewdemo.item.DemoItemViewFactory;

import java.util.List;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Demo2Adapter extends BaseAdapter {
    private List<DemoEntity> mDemoEntities;
    private Context mContext;

    public Demo2Adapter(List<DemoEntity> demoEntities, Context context) {
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.listview_layout, null);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) view.findViewById(R.id.title);
            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.title.setText(mDemoEntities.get(i).getContent());
        return view;
    }

    private class ViewHolder {
        private TextView title;
    }

}
