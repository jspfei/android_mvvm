package com.jf.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jf.mvvm.BR;
import com.jf.mvvm.R;

public class FruitItem extends BaseObservable implements IBaseBindingAdapterItem {
    private int picId;//图片ID
    private String describe;//描述

    public FruitItem(int picId, String describe) {
        this.picId = picId;
        this.describe = describe;
    }

    @Bindable
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
        notifyPropertyChanged(BR.describe);
    }

    @Bindable
    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
        notifyPropertyChanged(BR.picId);
    }






    @Override
    public int getItemViewType() {
        return R.layout.item_fruit;
    }
}
