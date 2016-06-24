package com.smyhvae.radiogrouptabdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.smyhvae.radiogrouptabdemo.R;

/**
 * Created by Administrator on 2016/6/24.
 */
public class XuanxiangActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xuanxiang);
        getSupportActionBar().setTitle("选项信息");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
