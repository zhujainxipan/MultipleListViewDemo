package com.example.annuoaichengzhang.multiplelistviewdemo.entity;

/**
 * Created by niehongtao on 16/4/9.
 */
public class Message {
    public static final int MSG_SUCCESS = 0;
    public static final int MSG_ERROR = 1;
    public static final int MSG_SENDING = 2;

    private String type;
    private String content;
    private boolean isChecked;
    private boolean isActive;
    private int state;



    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}