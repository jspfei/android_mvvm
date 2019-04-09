package com.jf.databindingdemo.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jf.mvvm.R;
import com.jf.mvvm.databinding.ActivityMainBinding;
import com.jf.databindingdemo.handler.OnClickHandler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setClickListener(this);
        binding.setHandler(new OnClickHandler());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_data_binding :
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TestDataBindActivity.class);
                    startActivity(intent);
                break;
            case R.id.button_data_binding_2 :
                    Intent intent1 = new Intent();
                    intent1.setClass(MainActivity.this, TestDataBind2Activity.class);
                    startActivity(intent1);
                break;
            case R.id.recycler_view_bind_btn:
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent2);
                 break;

            case R.id.double_bind_btn:
                Intent intent3 = new Intent();
                intent3.setClass(MainActivity.this,DoubleBindActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
