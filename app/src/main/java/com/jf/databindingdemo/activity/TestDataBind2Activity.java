package com.jf.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jf.mvvm.R;
import com.jf.mvvm.databinding.ActivityTestDataBind2Binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDataBind2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityTestDataBind2Binding bind2Binding = DataBindingUtil.setContentView(this,
                R.layout.activity_test_data_bind2);

        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        bind2Binding.setList(list);

        HashMap<String,Object> map = new HashMap<>();
        map.put("key0","map_value0");
        map.put("key1","jsss");
        bind2Binding.setMap(map);

        String[] arrays = {"string1","string2"};
        bind2Binding.setArray(arrays);
    }
}
