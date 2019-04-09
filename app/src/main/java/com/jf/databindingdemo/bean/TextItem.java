package com.jf.databindingdemo.bean;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jf.mvvm.BR;
import com.jf.mvvm.R;

public class TextItem extends BaseObservable implements IBaseBindingAdapterItem {

    private String text;

    public TextItem(String text) {
        this.text = text;
    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

    @Override
    public int getItemViewType() {
        return R.layout.item_text;
    }
}
