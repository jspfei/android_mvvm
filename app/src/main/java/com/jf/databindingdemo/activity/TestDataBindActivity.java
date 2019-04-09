package com.jf.databindingdemo.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jf.databindingdemo.bean.user.UserBean;
import com.jf.mvvm.R;
import com.jf.mvvm.databinding.ActivityTestDataBindBinding;

public class TestDataBindActivity extends Activity {
    //用户头像
    private static final String URL_USER_PIC = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4138850978,2612460506&fm=200&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityTestDataBindBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_test_data_bind);
        com.jf.databindingdemo.bean.UserBean userBean = new com.jf.databindingdemo.bean.UserBean(URL_USER_PIC,"李灰灰",23);
        binding.setUser(userBean);

        UserBean userBean1 = new UserBean("我是2",12);
        binding.setUser2(userBean1);

    }
}

