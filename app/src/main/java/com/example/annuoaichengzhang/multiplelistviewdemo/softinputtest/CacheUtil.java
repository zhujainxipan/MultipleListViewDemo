package com.example.annuoaichengzhang.multiplelistviewdemo.softinputtest;

import android.util.Log;

import com.example.annuoaichengzhang.multiplelistviewdemo.entity.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niehongtao on 16/5/4.
 */
public class CacheUtil {
    private List<Message> mMessageList;
    private Demo2Adapter mDemo2Adapter;
    // 缓存列表
    private List<Message> mCacheMessageList = new ArrayList<>();


    public CacheUtil(List<Message> messageList, Demo2Adapter adapter) {
        this.mMessageList = messageList;
        this.mDemo2Adapter = adapter;
    }


    /**
     * 更新缓存状态
     */
    public void updateCacheMessage(Message cacheMessage, int state) {
        cacheMessage.setState(state);
        fresh();
    }

    /**
     * 创建回复缓存
     */
    public Message createCacheMessage(String content) {
        Message cacheMessage = getCacheMessage(content);
        // 将缓存加入缓存列表
        addCache(cacheMessage);
        // 刷新listview列表
        fresh();
        return cacheMessage;
    }


    private Message getCacheMessage(String content) {
        Message cacheMessage = new Message();
        // 设置缓存的文字内容
        cacheMessage.setContent(content);
        // 设置缓存的状态为发送中
        cacheMessage.setState(Message.MSG_SENDING);
        return cacheMessage;
    }


    /**
     * 删除缓存
     */
    public void removeCache(Message cacheMessage) {
        mCacheMessageList.remove(cacheMessage);
    }

    /**
     * 将缓存加入缓存列表
     */
    public void addCache(Message cacheMessage) {
        mCacheMessageList.add(cacheMessage);
        mMessageList.addAll(mCacheMessageList);

        Log.d(":nht...", mMessageList.size() + "");
    }




    /**
     * 刷新列表
     */
    public void fresh() {
        mDemo2Adapter.refresh(mMessageList);
    }


}
