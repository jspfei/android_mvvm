package com.jf.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jf.databindingdemo.bean.DoubleBindBean;
import com.jf.databindingdemo.bean.DoubleBindBean2;
import com.jf.mvvm.R;
import com.jf.mvvm.databinding.ActivityDoubleBindBinding;

public class DoubleBindActivity extends AppCompatActivity implements View.OnClickListener {
    private DoubleBindBean doubleBindBean;
    private DoubleBindBean2 doubleBindBean2;
    private ObservableArrayList<String> list = new ObservableArrayList<>();
    private ObservableArrayMap<String,Object> map = new ObservableArrayMap<>();
    private boolean flag;
    private boolean flag2;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityDoubleBindBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_double_bind);

        doubleBindBean = new DoubleBindBean("我是first");
        binding.setDoubleBindBean(doubleBindBean);

        doubleBindBean2 = new DoubleBindBean2();
        doubleBindBean2.username.set("我是first2");
        binding.setDoubleBindBean2(doubleBindBean2);

        list.add("list1");
        list.add("list2");
        binding.setList(list);

        map.put("key0","key0_v");
        map.put("key1","key1_v");
        binding.setMap(map);

        binding.setOnClickListener(this);

        //binding 根据ID 获取view
        binding.doubleContent.setText("By Id Change");

}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.change_content_btn:
                flag = !flag;
                if(flag){
                    doubleBindBean.setContent("我是Second");
                }else{
                    doubleBindBean.setContent("我是third");
                }
                break;
            case R.id.change_content_btn_2:
                flag2 = !flag2;
                if(flag2){
                    doubleBindBean2.username.set("我是Second2");
                }else{
                    doubleBindBean2.username.set("我是third2");
                }
                break;

            case R.id.change_content_btn3:
                list.set(0,"change list ");
                break;
            case R.id.change_content_btn4:
                map.put("key0","change map 0");

                break;
        }
    }
}
