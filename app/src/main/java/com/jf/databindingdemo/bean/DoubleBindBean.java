package com.jf.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jf.mvvm.BR;

public class DoubleBindBean extends BaseObservable {
    private String content;//内容
    public DoubleBindBean(String content) {
        this.content = content;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyPropertyChanged(BR.content);
    }
}
