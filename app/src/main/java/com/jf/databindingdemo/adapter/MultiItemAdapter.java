package com.jf.databindingdemo.adapter;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.jf.mvvm.R;
import com.jf.databindingdemo.base.BaseBindRecyclerViewAdapter;
import com.jf.databindingdemo.bean.FruitItem;
import com.jf.databindingdemo.bean.IBaseBindingAdapterItem;
import com.jf.databindingdemo.bean.TextItem;
import com.jf.mvvm.databinding.ItemFruitBinding;
import com.jf.mvvm.databinding.ItemTextBinding;

import java.util.List;


public class MultiItemAdapter extends BaseBindRecyclerViewAdapter<IBaseBindingAdapterItem> {

    public MultiItemAdapter(Context context, List<IBaseBindingAdapterItem> mList) {
        super(context, mList);
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getItemViewType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case R.layout.item_fruit:
                ItemFruitBinding itemFruitBinding = DataBindingUtil.inflate(inflater, R.layout.item_fruit, parent, false);
                return new FruitViewHolder(itemFruitBinding);
            case R.layout.item_text:
                ItemTextBinding itemTextBinding = DataBindingUtil.inflate(inflater, R.layout.item_text, parent, false);
                return new TextViewHolder(itemTextBinding);
            default:
                ItemFruitBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_fruit, parent, false);
                return new FruitViewHolder(binding);
        }
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof FruitViewHolder) {
            FruitItem fruitBean = (FruitItem) mList.get(position);
            ((FruitViewHolder) holder).getBinding().setItem(fruitBean);
            ((FruitViewHolder) holder).getBinding().executePendingBindings(); //解决databinding闪烁问题
        } else if (holder instanceof TextViewHolder) {
            TextItem textBean = (TextItem) mList.get(position);
            ((TextViewHolder) holder).getBinding().setItem(textBean);
            ((TextViewHolder) holder).getBinding().executePendingBindings(); //解决databinding闪烁问题
        }
    }

    class FruitViewHolder extends RecyclerView.ViewHolder {
        private ItemFruitBinding binding;

        public ItemFruitBinding getBinding() {
            return binding;
        }

        public FruitViewHolder(ItemFruitBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    class TextViewHolder extends RecyclerView.ViewHolder {
        private ItemTextBinding binding;

        public ItemTextBinding getBinding() {
            return binding;
        }

        public TextViewHolder(ItemTextBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
