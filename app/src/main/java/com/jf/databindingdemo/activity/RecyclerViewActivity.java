package com.jf.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;

import com.jf.databindingdemo.adapter.MultiItemAdapter;
import com.jf.databindingdemo.bean.FruitItem;
import com.jf.databindingdemo.bean.IBaseBindingAdapterItem;
import com.jf.databindingdemo.bean.TextItem;
import com.jf.mvvm.R;
import com.jf.mvvm.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private MultiItemAdapter mAdapter;
    private List<IBaseBindingAdapterItem> mList = new ArrayList<>(); //数据源

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_recycler_view);

        initData();
        mAdapter = new MultiItemAdapter(this, mList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        binding.recyclerView.setLayoutManager(layoutManager);
        binding.recyclerView.setAdapter(mAdapter);
    }

    private void initData() {
        mList.add(new TextItem("标题1"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "苹果"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "香蕉"));
        mList.add(new TextItem("标题2"));
        mList.add(new TextItem("标题3"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "桃子"));
        mList.add(new TextItem("标题4"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "梨"));
        mList.add(new TextItem("标题5"));

        mList.add(new TextItem("标题1"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "苹果"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "香蕉"));
        mList.add(new TextItem("标题2"));
        mList.add(new TextItem("标题3"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "桃子"));
        mList.add(new TextItem("标题4"));
        mList.add(new FruitItem(R.mipmap.ic_launcher, "梨"));
        mList.add(new TextItem("标题5"));
    }
}
