package com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.annuoaichengzhang.multiplelistviewdemo.R;
import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Demo2Adapter extends BaseAdapter {
    private List<Message> mMessages;
    private Context mContext;

    public Demo2Adapter(List<Message> messages, Context context) {
        this.mMessages = messages;
        this.mContext = context;
    }


    public void refresh(List<Message> datas) {
        if (datas == null) {
            datas = new ArrayList<>(0);
        }
        this.mMessages = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (mMessages != null) {
            ret = mMessages.size();
        }
        return ret;
    }


    @Override
    public Object getItem(int position) {
        Object ret = null;
        if (mMessages != null) {
            ret = mMessages.get(position);
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
            viewHolder.mProgressBar = (ProgressBar) view.findViewById(R.id.msg_sending);
            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.title.setText(mMessages.get(i).getContent());
        if (mMessages.get(i).getState() == Message.MSG_SENDING) {
            viewHolder.mProgressBar.setVisibility(View.VISIBLE);
        } else {
            viewHolder.mProgressBar.setVisibility(View.GONE);
        }

        return view;
    }

    private class ViewHolder {
        private TextView title;
        private ProgressBar mProgressBar;
    }

}
