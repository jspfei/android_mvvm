package com.jf.databindingdemo.adapter;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.jf.databindingdemo.base.BaseBindingViewHolder;
import com.jf.databindingdemo.bean.FruitItem;
import com.jf.mvvm.BR;
import com.jf.mvvm.R;
import com.jf.databindingdemo.base.BaseBindRecyclerViewAdapter;

import java.util.List;

public class MyAdapter extends BaseBindRecyclerViewAdapter<FruitItem> {

    public MyAdapter(Context context, List<FruitItem> mList) {
        super(context, mList);
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        //ItemFruitRvBinding包含了Layout中所有的控件；
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_fruit, parent, false);
        return new BaseBindingViewHolder(binding); //binding.getRoot():获取item的根布局
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewDataBinding binding = DataBindingUtil.getBinding(holder.itemView);
        binding.setVariable(BR.item,mList.get(position));
        binding.executePendingBindings(); //数据改变时立即刷新数据
    }
}
